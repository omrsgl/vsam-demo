package com.vsam_api.openlegacy.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Tom Fingerman 17/02/2020.
 */
@Getter
@Setter
public class RecordData {
    private String fieldName;
    private Object fieldValue;
    private String fieldType;
}
