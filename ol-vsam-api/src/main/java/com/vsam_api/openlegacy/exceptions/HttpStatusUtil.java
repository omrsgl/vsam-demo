package com.vsam_api.openlegacy.exceptions;

import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class HttpStatusUtil {

    private static final List<String> UNAUTHORIZED = Arrays.asList("authe", "autho");
    private static final List<String> FORBIDDEN = Arrays.asList("denied");
    private static final List<String> BAD_REQUEST = Arrays.asList("bad", "wrong", "missed", "cannot");
    private static final List<String> NOT_FOUND = Arrays.asList("not exist", "not found");

    public static HttpStatus getStatusFromException(String message){
        AtomicReference<String> mes = new AtomicReference<>(message.toLowerCase());
        if (UNAUTHORIZED.stream().anyMatch(s -> mes.get().contains(s))) {
            return HttpStatus.UNAUTHORIZED;
        }

        if (FORBIDDEN.stream().anyMatch(s -> mes.get().contains(s))) {
            return HttpStatus.FORBIDDEN;
        }

        if (BAD_REQUEST.stream().anyMatch(s -> mes.get().contains(s))) {
            return HttpStatus.BAD_REQUEST;
        }

        if (NOT_FOUND.stream().anyMatch(s -> mes.get().contains(s))) {
            return HttpStatus.NOT_FOUND;
        }

        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
