package com.vsam_api.openlegacy.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Tom Fingerman 17/02/2020.
 */
@Getter
@Setter
public class SearchRecordCriteria {
    private String fieldName;
    private String fieldValue;
    private Boolean isFullMatch;
    private String fieldType;
}
