package com.nastypad.productsmicroservices.resources.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String entity, long resourceId) {
        super(String.format("%d not found in %s data.", resourceId, entity));
    }
}
