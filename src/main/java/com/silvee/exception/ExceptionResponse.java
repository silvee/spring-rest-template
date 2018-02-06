package com.silvee.exception;

import java.util.List;

public class ExceptionResponse {

    private String errorCode;
    private String errorMessage;

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    private List<String> errors;

    public ExceptionResponse(List<String> errors) {
        this.errors = errors;
    }

    public ExceptionResponse() {
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


}