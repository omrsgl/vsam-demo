package com.vsam_api.openlegacy.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Tom Fingerman 17/02/2020.
 */
@Getter
@Setter
public class VsamObjectsResponse {
    private String status = "success";
    private List<VsamFileDescription> objects;
}
