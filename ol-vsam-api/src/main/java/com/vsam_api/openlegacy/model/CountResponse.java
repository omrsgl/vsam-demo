package com.vsam_api.openlegacy.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Tom Fingerman 17/02/2020.
 */
@RequiredArgsConstructor
@Getter
public class CountResponse {
    private String status = "success";
    private final Integer count;
}
