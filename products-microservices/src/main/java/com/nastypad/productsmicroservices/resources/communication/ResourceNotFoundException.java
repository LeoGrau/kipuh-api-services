package com.nastypad.productsmicroservices.resources.communication;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
