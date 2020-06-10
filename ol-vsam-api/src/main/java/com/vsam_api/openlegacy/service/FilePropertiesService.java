package com.vsam_api.openlegacy.service;

import com.vsam_api.openlegacy.config.VsamFileProperties;
import com.vsam_api.openlegacy.constants.VsamFileProperty;
import com.vsam_api.openlegacy.constants.VsamFileType;
import lombok.RequiredArgsConstructor;
import org.openlegacy.core.exceptions.OpenLegacyRuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
@RequiredArgsConstructor
public class FilePropertiesService {

    @Autowired
    private VsamFileProperties vsamFileProperties;

    public VsamFileType getVsamFileType(String objectName) {
        VsamFileProperties.VsamFile fileDefinition = getVsamFileDefinition(objectName);
        if(fileDefinition == null)
            return null;
        return fileDefinition.getType();
    }

    public Object getVsamProperty(String objectName, VsamFileProperty property) {
        VsamFileProperties.VsamFile fileDefinition = getVsamFileDefinition(objectName);
        if(fileDefinition == null)
            return null ;
        Object value = getFieldValue(fileDefinition, property.getFieldName());
        if(value == null){
            VsamFileProperties.VsamFileTypeDefaults defaultFileDefinition = getDefaultVsamFileDefinition(objectName);
            if(defaultFileDefinition == null)
                return null ;
            value = getFieldValue(defaultFileDefinition, property.getFieldName());
        }
        return value;
    }

    private Object getFieldValue(Object obj, String fieldName) {
        Field field = null;
        try {
            field = obj.getClass().getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        field.setAccessible(true);
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    private VsamFileProperties.VsamFile getVsamFileDefinition(String objectName) {
        for(VsamFileProperties.VsamFile file : vsamFileProperties.getFiles()){
        if(file.getName().equals(objectName))
        return file;
        }
        return null;
    }

    private VsamFileProperties.VsamFileTypeDefaults getDefaultVsamFileDefinition(String objectName) {
        return vsamFileProperties.getFileTypesDefaults().get(getVsamFileType(objectName));
    }

    public void validateFileProperty(String objectName) {
        VsamFileProperties.VsamFile fileDefinition = getVsamFileDefinition(objectName);
        if(fileDefinition == null)
            throw(new OpenLegacyRuntimeException("Missing VSAM file property in `application.yml` for object-name `" + objectName + "`"));
        if(fileDefinition.getType() == null)
            throw(new OpenLegacyRuntimeException("Missing VSAM file type property in `application.yml` for object-name `" + objectName + "`. e.g. (KSDS, ESDS, etc)"));
    }
}
