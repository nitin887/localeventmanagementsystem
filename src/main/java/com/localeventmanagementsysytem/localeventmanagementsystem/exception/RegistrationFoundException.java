package com.localeventmanagementsysytem.localeventmanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class RegistrationFoundException extends RuntimeException {
    public RegistrationFoundException(String message) {
        super(message);
    }
}
