package com.vsam_api.openlegacy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.openlegacy.core.rpc.RpcSession;
import org.openlegacy.core.rpc.actions.RpcAction;
import org.openlegacy.core.rpc.actions.RpcActions;
import org.openlegacy.providers.vsam.VsamConstants;
import org.openlegacy.providers.vsam.entity.EsdsRecords;
import org.openlegacy.providers.vsam.entity.SearchEsdsRecords;
import org.openlegacy.providers.vsam.entity.SearchVsamRecords;
import org.openlegacy.providers.vsam.entity.VsamRecords;
import org.openlegacy.providers.vsam.entity.VsamSearchCriteria;
import org.openlegacy.utils.ByteUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.github.wnameless.json.flattener.JsonFlattener;
import com.vsam_api.openlegacy.constants.VsamFileProperty;
import com.vsam_api.openlegacy.constants.VsamFileType;
import com.vsam_api.openlegacy.exceptions.VsamApiException;
import com.vsam_api.openlegacy.model.CountResponse;
import com.vsam_api.openlegacy.model.Record;
import com.vsam_api.openlegacy.model.RecordData;
import com.vsam_api.openlegacy.model.RecordsResponse;
import com.vsam_api.openlegacy.model.RecordsResponseByID;
import com.vsam_api.openlegacy.model.SearchRecordCriteria;
import com.vsam_api.openlegacy.model.SearchRecordsResponse;
import com.vsam_api.openlegacy.model.VsamFileDescription;
import com.vsam_api.openlegacy.model.VsamObjectDescribeResponse;
import com.vsam_api.openlegacy.model.VsamObjectsResponse;
import com.vsam_api.openlegacy.model.VsamRecordFieldDescription;

import io.vertx.core.json.Json;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ObjectServiceImpl implements ObjectService {

    private final ApplicationContext applicationContext;
    private final VsamFileService vsamFileService;
    private final FilePropertiesService filePropertiesService;

    @Override
    public VsamObjectsResponse objects() {
        VsamObjectsResponse vsamObjectsResponse = new VsamObjectsResponse();
        List<VsamFileDescription> vsamFileDescriptions = new ArrayList<>();
        this.vsamFileService.getObjects().forEach((key, value) -> {
            VsamFileDescription desc = getVsamFileDescription(key, value);
            vsamFileDescriptions.add(desc);
        });

        vsamObjectsResponse.setObjects(vsamFileDescriptions);
        return vsamObjectsResponse;
    }

    @NotNull
    private VsamFileDescription getVsamFileDescription(String key, Map<String, Object> value) {
        VsamFileDescription desc = new VsamFileDescription();
        desc.setObjectName(key);
        Map<String, Object> flatten = JsonFlattener.flattenAsMap(Json.encode(value));
        List<VsamRecordFieldDescription> fields = new ArrayList<>();
        flatten.forEach((flattenKey, flattenValue) -> {
            VsamRecordFieldDescription fieldDesc = new VsamRecordFieldDescription();
            fieldDesc.setFieldName(flattenKey);
            fieldDesc.setFieldType(flattenValue == null ? null : flattenValue.getClass().getSimpleName());
            fields.add(fieldDesc);
        });
        desc.setFields(fields);
        return desc;
    }

    @Override
    public VsamObjectDescribeResponse objectDescription(String objectName) {
        Map<String, Object> map = this.vsamFileService.getObjects().get(objectName);
        VsamObjectDescribeResponse response = new VsamObjectDescribeResponse();
        response.setObjectName(objectName);
        response.setFields(getVsamFileDescription(objectName, map).getFields());
        return response;
    }

    @Override
    public CountResponse count() {
        return new CountResponse(-1);
    }

    @Override
    public RecordsResponse records(String objectName,
                                   String key,
                                   Integer count,
                                   Integer retries) {
        RecordsResponse response = new RecordsResponse();
        filePropertiesService.validateFileProperty(objectName);
        VsamFileType vsamFileType = filePropertiesService.getVsamFileType(objectName);
        Integer keyOffset = (Integer) filePropertiesService.getVsamProperty(objectName, VsamFileProperty.KEY_OFFSET);
        Integer keyLength = (Integer) filePropertiesService.getVsamProperty(objectName, VsamFileProperty.KEY_LENGTH);
        Integer recordMaxLength = (Integer) filePropertiesService.getVsamProperty(objectName, VsamFileProperty.RECORD_MAX_LENGTH);
        byte[] keyInBytes = key != null ? ByteUtils.hexStringToByteArray(key) : ByteUtils.hexStringToByteArray(StringUtils.repeat("00", keyLength));
        RpcAction action = RpcActions.execute();
        action.getRunTimeProperties().put(VsamConstants.PAGINATION_KEY, ByteUtils.bytesToHex(keyInBytes));
        action.getRunTimeProperties().put(VsamConstants.FILE_NAME,objectName);
        try (RpcSession rpcSession = applicationContext.getBean("vsamSdkSession", RpcSession.class)) {
            switch (vsamFileType){
                case KSDS:
                    VsamRecords resultKsds = null;
                    VsamRecords vsamRecords = new VsamRecords();
                    vsamRecords.setFileName(objectName);
                    vsamRecords.setKey(keyInBytes);
                    vsamRecords.setKeyLength(keyLength);
                    vsamRecords.setNumberOfRecords(count);
                    vsamRecords.setKeyOffset(keyOffset);
                    vsamRecords.setRecordLength(recordMaxLength);
                    resultKsds = rpcSession.doAction(action, vsamRecords);
                    response.setPaginationKey(vsamFileService.handlePaginationKey(resultKsds.getKey(), key, keyLength));
                    response.setRecords(vsamRecordObjectsToRecords(resultKsds.getRecords()));
                    break;
                case ESDS:
                    EsdsRecords resultEsds = null;
                    EsdsRecords esdsRecords = new EsdsRecords();
                    esdsRecords.setFileName(objectName);
                    esdsRecords.setKey(keyInBytes);
                    esdsRecords.setKeyLength(keyLength);
                    esdsRecords.setNumberOfRecords(count);
                    esdsRecords.setKeyOffset(keyOffset);
                    esdsRecords.setRecordLength(recordMaxLength);
                    resultEsds = rpcSession.doAction(action, esdsRecords);
                    response.setPaginationKey(vsamFileService.handlePaginationKey(resultEsds.getKey(), key, keyLength));
                    response.setRecords(vsamRecordObjectsToRecords(resultEsds.getRecords()));
                    break;
            }
            return response;
        } catch(Exception e) {
            throw new VsamApiException(e, key, retries);
        }
    }

    @Override
    public RecordsResponseByID recordById(String objectName,
                                          String key) {
        RecordsResponseByID response = new RecordsResponseByID();
        filePropertiesService.validateFileProperty(objectName);
        VsamFileType vsamFileType = filePropertiesService.getVsamFileType(objectName);
        Integer keyOffset = (Integer) filePropertiesService.getVsamProperty(objectName, VsamFileProperty.KEY_OFFSET);
        Integer keyLength = (Integer) filePropertiesService.getVsamProperty(objectName, VsamFileProperty.KEY_LENGTH);
        Integer recordMaxLength = (Integer) filePropertiesService.getVsamProperty(objectName, VsamFileProperty.RECORD_MAX_LENGTH);
        byte[] keyInBytes = key != null ? ByteUtils.hexStringToByteArray(key) : ByteUtils.hexStringToByteArray(StringUtils.repeat("00", keyLength));
        RpcAction action = RpcActions.execute();
        action.getRunTimeProperties().put(VsamConstants.PAGINATION_KEY, ByteUtils.bytesToHex(keyInBytes));
        action.getRunTimeProperties().put(VsamConstants.FILE_NAME,objectName);
        try (RpcSession rpcSession = applicationContext.getBean("vsamSdkSession", RpcSession.class)) {
            switch (vsamFileType){
                case KSDS:
                    VsamRecords resultKsds = null;
                    VsamRecords vsamRecords = new VsamRecords();
                    vsamRecords.setFileName(objectName);
                    vsamRecords.setKey(keyInBytes);
                    vsamRecords.setKeyLength(keyLength);
                    vsamRecords.setNumberOfRecords(1);
                    vsamRecords.setKeyOffset(keyOffset);
                    vsamRecords.setRecordLength(recordMaxLength);
                    resultKsds = rpcSession.doAction(action, vsamRecords);
                    response.setRecords(vsamRecordObjectsToRecords(resultKsds.getRecords()).get(0));
                    break;
                case ESDS:
                    EsdsRecords resultEsds = null;
                    EsdsRecords esdsRecords = new EsdsRecords();
                    esdsRecords.setFileName(objectName);
                    esdsRecords.setKey(keyInBytes);
                    esdsRecords.setKeyLength(keyLength);
                    esdsRecords.setNumberOfRecords(1);
                    esdsRecords.setKeyOffset(keyOffset);
                    esdsRecords.setRecordLength(recordMaxLength);
                    resultEsds = rpcSession.doAction(action, esdsRecords);
                    response.setRecords(vsamRecordObjectsToRecords(resultEsds.getRecords()).get(0));
                    break;
            }
            return response;
        } catch(Exception e) {
            throw new VsamApiException(e, key);
        }
    }

    @Override
    public SearchRecordsResponse search(
    		Integer maxScanCount,
    		String objectName,
            String key,
            List<SearchRecordCriteria> searchRecordCriteria,
            Integer retries) {
            SearchRecordsResponse response = new SearchRecordsResponse();
            filePropertiesService.validateFileProperty(objectName);
        	try (RpcSession rpcSession = applicationContext.getBean("vsamSdkSession", RpcSession.class)) {
                Integer numberOfRecords = maxScanCount != null ? maxScanCount : 1000;
                VsamFileType vsamFileType = filePropertiesService.getVsamFileType(objectName);
                Integer keyOffset = (Integer) filePropertiesService.getVsamProperty(objectName, VsamFileProperty.KEY_OFFSET);
                Integer keyLength = (Integer) filePropertiesService.getVsamProperty(objectName, VsamFileProperty.KEY_LENGTH);
                Integer recordMaxLength = (Integer) filePropertiesService.getVsamProperty(objectName, VsamFileProperty.RECORD_MAX_LENGTH);
                byte[] keyInBytes = key != null ? ByteUtils.hexStringToByteArray(key) : ByteUtils.hexStringToByteArray(StringUtils.repeat("00", keyLength));
                RpcAction action = RpcActions.execute();
                action.getRunTimeProperties().put(VsamConstants.PAGINATION_KEY, ByteUtils.bytesToHex(keyInBytes));
                action.getRunTimeProperties().put(VsamConstants.FILE_NAME,objectName);

                switch (vsamFileType){
                    case KSDS:
                        SearchVsamRecords searchVsamRecords = new SearchVsamRecords();
                        searchVsamRecords.setFileName(objectName);
                        searchVsamRecords.setKeyOffset(keyOffset);
                        searchVsamRecords.setKey(keyInBytes);
                        searchVsamRecords.setKeyLength(keyLength);
                        searchVsamRecords.setNumberOfRecords(numberOfRecords);
                        searchVsamRecords.setRecordLength(recordMaxLength);
                        searchRecordCriteria.forEach(criteria -> {
                            VsamSearchCriteria searchCriteria = new VsamSearchCriteria();
                            searchCriteria.setSearchValue(vsamFileService.convertToBytes(criteria.getFieldValue(), criteria.getFieldType()));
                            searchCriteria.setSearchLength(criteria.getFieldValue().length());
                            searchVsamRecords.getSearchCriteria().add(searchCriteria);
                        });

                        SearchVsamRecords result = rpcSession.doAction(action, searchVsamRecords);
                        List<Record> filteredRecords = this.vsamFileService.filterRecords(searchRecordCriteria, vsamRecordObjectsToRecords(result.getRecords()));
                        response.setPaginationKey(vsamFileService.handlePaginationKey(result.getKey(), key, keyLength));
                        response.setRecords(filteredRecords);
                        break;
                    case ESDS:
                        SearchEsdsRecords searchEsdsRecords = new SearchEsdsRecords();
                        searchEsdsRecords.setFileName(objectName);
                        searchEsdsRecords.setKeyOffset(keyOffset);
                        searchEsdsRecords.setKey(keyInBytes);
                        searchEsdsRecords.setKeyLength(keyLength);
                        searchEsdsRecords.setNumberOfRecords(numberOfRecords);
                        searchEsdsRecords.setRecordLength(recordMaxLength);
                        searchRecordCriteria.forEach(criteria -> {
                            VsamSearchCriteria searchCriteria = new VsamSearchCriteria();
                            searchCriteria.setSearchValue(vsamFileService.convertToBytes(criteria.getFieldValue(), criteria.getFieldType()));
                            searchCriteria.setSearchLength(criteria.getFieldValue().length());
                            searchEsdsRecords.getSearchCriteria().add(searchCriteria);
                        });

                        SearchEsdsRecords _result = rpcSession.doAction(action, searchEsdsRecords);
                        List<Record> _filteredRecords = this.vsamFileService.filterRecords(searchRecordCriteria, vsamRecordObjectsToRecords(_result.getRecords()));
                        response.setPaginationKey(vsamFileService.handlePaginationKey(_result.getKey(), key, keyLength));
                        response.setRecords(_filteredRecords);
                        break;
            }
            return response;
        } catch(Exception e) {
            throw new VsamApiException(e, key, retries);
        }
    }

    public static List<Record> vsamRecordObjectsToRecords(List<Object> records) {

        return records.stream()
            .map(record -> {
                Map<String, Object> flatten = JsonFlattener.flattenAsMap(Json.encode(record));
                List<RecordData> recordDataList = new ArrayList<>();
                flatten.forEach((key, value) -> {
                    RecordData recordData = new RecordData();
                    recordData.setFieldType(value != null ? value.getClass().getSimpleName() : null);
                    recordData.setFieldName(key);
                    recordData.setFieldValue(value);
                    recordDataList.add(recordData);
                });
                Record response = new Record();
                response.setId(isToStringMethodOverridden(record) ? record.toString() : null);
                response.setData(recordDataList);
                return response;
            }).collect(Collectors.toList());
    }

    private static boolean isToStringMethodOverridden(Object record){
        if(record == null)
            return false;
        try {
            return !(record.getClass().getMethod("toString").getDeclaringClass().equals(Object.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return false;
    }
}
