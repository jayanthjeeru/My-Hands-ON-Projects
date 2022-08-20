package com.learn.userprofileservice.exception;

public class UserExistsException extends Exception {
    public UserExistsException(String message) {
        super(message);
    }
}
