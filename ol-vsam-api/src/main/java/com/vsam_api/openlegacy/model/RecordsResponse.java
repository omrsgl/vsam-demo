package com.vsam_api.openlegacy.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Tom Fingerman 17/02/2020.
 */
@Getter
@Setter
public class RecordsResponse {
    private String status = "success";
    private String paginationKey;
    private List<Record> records;
    private Integer offset = 0;
    Integer retries = 1;
}
