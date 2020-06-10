package com.vsam_api.openlegacy.constants;

public enum VsamFileProperty {
    type("type"), KEY_OFFSET("keyOffset"), KEY_LENGTH("keyLength"), RECORD_MAX_LENGTH("recordMaxLength");

    private String fieldName;

    VsamFileProperty(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }
}
