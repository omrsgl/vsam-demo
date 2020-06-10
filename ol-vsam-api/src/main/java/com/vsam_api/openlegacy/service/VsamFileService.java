package com.vsam_api.openlegacy.service;

import com.vsam_api.openlegacy.model.Record;
import com.vsam_api.openlegacy.model.RecordData;
import com.vsam_api.openlegacy.model.SearchRecordCriteria;
import com.vsam_api.openlegacy.util.VsamConvertUtil;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.openlegacy.core.exceptions.OpenLegacyRuntimeException;
import org.openlegacy.core.model.entity.ClassDefinition;
import org.openlegacy.core.model.field.CollectionFieldDefinition;
import org.openlegacy.core.model.field.FieldDefinition;
import org.openlegacy.core.model.field.RpcCollectionFieldDefinition;
import org.openlegacy.core.model.field.RpcPartFieldDefinition;
import org.openlegacy.core.registry.EntitiesRegistry;
import org.openlegacy.providers.vsam.properties.VsamProperties;
import org.openlegacy.utils.ByteUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Tom Fingerman 13/02/2020.
 */
@Component
public class VsamFileService {
    private final EntitiesRegistry entitiesRegistry;
    //public final String EMPTY_PAGINATION_KEY = StringUtils.repeat("00", 32);

    @Getter
    private final Map<String, Map<String, Object>> objects = new HashMap<>();

    public VsamFileService(
        EntitiesRegistry entitiesRegistry,
        VsamProperties vsamProperties
    ) {
        this.entitiesRegistry = entitiesRegistry;

        vsamProperties.getFiles()
            .forEach(vsamFile -> this.objects.put(vsamFile.getName(), extractFields(vsamFile.getPartNames())));
    }

    public Map<String, Object> extractFields(List<String> partNames) {
        Map<String, Object> fields = new HashMap<>();
        entitiesRegistry.getAll()
            .stream()
            .filter(it -> partNames.isEmpty() || partNames.contains(it.getName()))
            .forEach(it -> {
                Map<String, FieldDefinition> fieldDefinitions = it.getFieldDefinitions();
                handleFieldDefinitions(fields, fieldDefinitions);
            });

        return fields;
    }

    private void handleFieldDefinitions(Map<String, Object> fields,
                                        Map<String, FieldDefinition> fieldDefinitions) {
        fieldDefinitions.values().forEach(fieldDefinition -> {
            if (fieldDefinition instanceof RpcPartFieldDefinition) {
                Map<String, Object> partFields = new HashMap<>();
                ClassDefinition classDefinition = entitiesRegistry.get(fieldDefinition.getJavaType());
                handleFieldDefinitions(partFields, classDefinition.getFieldDefinitions());
                fields.put(fieldDefinition.getName(), partFields);
            } else if (fieldDefinition instanceof RpcCollectionFieldDefinition) {
                CollectionFieldDefinition collectionFieldDefinition = (CollectionFieldDefinition) fieldDefinition;
                fields.put(fieldDefinition.getName(), String.format("%s<%s>", fieldDefinition.getJavaType(), collectionFieldDefinition.getElement().getJavaType()));
            } else {
                fields.put(fieldDefinition.getName(), fieldDefinition.getJavaType());
            }
        });
    }

    //TODO: refine this code
    public List<Record> filterRecords(List<SearchRecordCriteria> searchRecordCriteria, List<Record> list) {
        List<Record> filteredRecords = new ArrayList<>();
        Boolean isComplianceCriteria = false;
        for (Record record : list) {
            for (SearchRecordCriteria criteria : searchRecordCriteria) {
                isComplianceCriteria = false;
                for (RecordData recordData : record.getData()) {
                    if (recordData.getFieldName().equals(criteria.getFieldName())) {
                        if (recordData.getFieldValue() != null && criteria.getFieldValue() != null &&
                            (criteria.getIsFullMatch() && recordData.getFieldValue().toString().equals(criteria.getFieldValue()) ||
                                !criteria.getIsFullMatch() && recordData.getFieldValue().toString().contains(criteria.getFieldValue())))
                            isComplianceCriteria = true;
                    }
                }
                if (isComplianceCriteria)
                    break;
            }

            if (isComplianceCriteria)
                filteredRecords.add(record);
        }
        return filteredRecords;
    }

    public String handlePaginationKey(byte[] key, String lastPaginationKey, Integer keyLength) {
        if (key == null)
            return null;
        String paginationKey = ByteUtils.bytesToHex(key);
        if (paginationKey.length() >= keyLength * 2)
            paginationKey = paginationKey.substring(0, keyLength * 2);
        paginationKey = paginationKey.equals(StringUtils.repeat("00", keyLength)) || paginationKey.equals(lastPaginationKey) ? null : paginationKey;
        return paginationKey;
    }

    public byte[] convertToBytes(String fieldValue, String fieldType) {
        final int SEARCH_FIELD_LENGTH = 40;
        byte[] result;
        String hexString = null;
        if (fieldType != null && fieldType.equals("BigDecimal")) {
            // Convert to MainFrameLegacyTypes.PackedDecimal
            try {
                //hexString = VsamConvertUtil.convertPackedDecimal(Integer.parseInt(fieldValue), SEARCH_FIELD_LENGTH, 0);
                hexString = VsamConvertUtil.convertNumZeroPaddedPositive(Integer.parseInt(fieldValue), SEARCH_FIELD_LENGTH);
            } catch (Exception e) {
                throw new OpenLegacyRuntimeException(String.format("Cannot convert 'BigDecimal' type to Integer for value '%s'", fieldValue));
            }
        } else {
            // Convert to MainFrameLegacyTypes.Char
            hexString = VsamConvertUtil.convertChar(fieldValue, SEARCH_FIELD_LENGTH);
        }
        return ByteUtils.hexStringToByteArray(hexString);
    }


    /*public String getLegacyType(String fieldName) {
        return //legacy type;
    }*/
}
