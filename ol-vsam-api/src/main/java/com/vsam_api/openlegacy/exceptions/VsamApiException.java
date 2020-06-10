package com.vsam_api.openlegacy.exceptions;

import lombok.Getter;
import org.openlegacy.core.exceptions.OpenLegacyRuntimeException;

@Getter
public class VsamApiException extends OpenLegacyRuntimeException {

    String paginationKey;

    Integer retries;

    public VsamApiException(Exception ex, String paginationKey) {
        super(ex);
        //super(String.format("VSAM API failed. The last paginationKey is `%s`", paginationKey));
        this.paginationKey = paginationKey;
    }

    public VsamApiException(Exception ex, String paginationKey, Integer retries) {
        super(ex);
        this.paginationKey = paginationKey;
        this.retries = retries;
    }
}
