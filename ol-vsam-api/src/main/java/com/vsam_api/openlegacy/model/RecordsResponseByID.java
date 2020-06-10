package com.vsam_api.openlegacy.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RecordsResponseByID {
    private String status = "success";
    private Record records;
    private Integer offset = 0;
}
