package com.vsam_api.openlegacy.exceptions;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.openlegacy.core.exceptions.rest.DefaultErrorCode;
import org.openlegacy.core.exceptions.rest.ErrorCode;
import org.openlegacy.core.exceptions.rest.ErrorCodeException;
import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import java.io.Writer;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by v_gorshkov on 24.07.2017.
 */
@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
@Primary
@ControllerAdvice
public class VsamGlobalExceptionHandler {

    private static ObjectMapper jsonMapper = new ObjectMapper();

    public void handle(HttpServletRequest request, HttpServletResponse response, Exception exception){
        try{
            ErrorResponseData data = handle(exception, request, null,null, null, null);
            response.setStatus(data.status.value());
            response.setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
            Writer writer = response.getWriter();
            writer.write(jsonMapper.writeValueAsString(data.response));
            writer.flush();
            writer.close();
        } catch (Exception e) {
            //rethrow on error controller
            throw new RuntimeException(exception);
        }
    }

    @Builder
    private static class ErrorResponseData {
        private VsamErrorModel response;

        private HttpStatus status;

        Integer retries;
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<VsamErrorModel> handle(Exception ex, HttpServletRequest request) {
        ErrorResponseData data = handle(ex, request, null, null, null, null);
        return new ResponseEntity<>(data.response, data.status);
    }

    @ExceptionHandler(value = {VsamApiException.class})
    public ResponseEntity<VsamErrorModel> handle(VsamApiException ex, HttpServletRequest request) {
        ErrorResponseData data = handle(ex, request, null, null, ex.getPaginationKey(), ex.getRetries());
        return new ResponseEntity<>(data.response, data.status);
    }

    private ErrorResponseData handle(Exception ex, HttpServletRequest httpServletRequest, WebRequest webRequest, HttpStatus status, String paginationKey, Integer retries){
        log.error(ex.getMessage(),ex);
        VsamErrorModel error = getInnerError(ex);
        if (error != null) {
            if (error.getError() == null || error.getError().isEmpty()) {
                error.setError(DefaultErrorCode.UNKNOWN.getValue());
            }
            return ErrorResponseData.builder().response(error).status(HttpStatus.valueOf(error.getStatus())).build();
        }
        ErrorCode errorCode = getErrorCode(ex.getMessage());
        if (status == null){
            status = HttpStatusUtil.getStatusFromException(ex.getMessage());
        }
        if (ex instanceof ErrorCodeException) {
            errorCode = ((ErrorCodeException) ex).getErrorCode();
        }
        Map<String, String> messages = new HashMap<>();
        if (ex.getClass().isAnnotationPresent(ResponseStatus.class)) {
            status = ex.getClass().getAnnotation(ResponseStatus.class).value();
        } else if (ex instanceof MethodArgumentNotValidException) {
            errorCode = DefaultErrorCode.VALIDATION;
            status = HttpStatus.BAD_REQUEST;
            ((MethodArgumentNotValidException) ex).getBindingResult()
                    .getAllErrors()
                    .forEach(e -> messages.put(e instanceof FieldError ? ((FieldError) e).getField() : e.getObjectName(), e.getDefaultMessage()));
        } else if (ex instanceof ConstraintViolationException) {
            errorCode = DefaultErrorCode.VALIDATION;
            status = HttpStatus.BAD_REQUEST;
            ((ConstraintViolationException)ex).getConstraintViolations().forEach(e -> messages.put(StringUtils.removeEnd(e.getPropertyPath().toString(), ".value"), e.getMessage()));
        } /*else if (ex instanceof AuthenticationException) {
            errorCode = DefaultErrorCode.AUTHENTICATION;
            status = HttpStatus.UNAUTHORIZED;
        }*/

        if (messages.isEmpty()){
            messages.put(VsamErrorModel.DEFAULT_ERROR_KEY, ex.getMessage());
        }

        String path = null;
        if (httpServletRequest != null){
            path = httpServletRequest.getRequestURI();
        }
        if (webRequest != null){
            path = webRequest.getDescription(false);
        }

        VsamErrorModel vsamErrorModel = new VsamErrorModel();
        vsamErrorModel.setTimestamp(new Date().getTime());
        vsamErrorModel.setStatus(status.value());
        vsamErrorModel.setError(errorCode.getValue());
        vsamErrorModel.setException(ex.getClass().getName());
        vsamErrorModel.setPath(path);
        vsamErrorModel.setMessages(messages);
        vsamErrorModel.setPaginationKey(paginationKey);
        vsamErrorModel.setRetries(retries == null ? 2 : retries + 1);

        return ErrorResponseData.builder()
            .response(
                vsamErrorModel)
            .status(status)
            .build();
    }

    private VsamErrorModel getInnerError(Exception exception) {
        if (exception.getMessage() == null || exception.getMessage().isEmpty()) {
            return null;
        }
        String message = exception.getMessage();
        if (message.toLowerCase().contains("content:")) {
            message = StringUtils.substringAfter(message,"content:").trim();
            try {
                return new ObjectMapper().readValue(message, VsamErrorModel.class);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    private ErrorCode getErrorCode(String message) {
        message = message.toLowerCase();
        if (message.contains("denied")) {
            return DefaultErrorCode.ACCESS_DENIED;
        }
        if (message.contains("auth")) {
            return DefaultErrorCode.AUTHENTICATION;
        }
        return DefaultErrorCode.NONE;
    }
}
