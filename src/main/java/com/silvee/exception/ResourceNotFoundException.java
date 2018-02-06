package com.silvee.exception;

public class ResourceNotFoundException extends RuntimeException {
    private Long resourceID;

    public ResourceNotFoundException(Long resourceID, String message) {
        super(message);
        this.resourceID = resourceID;
    }
}
