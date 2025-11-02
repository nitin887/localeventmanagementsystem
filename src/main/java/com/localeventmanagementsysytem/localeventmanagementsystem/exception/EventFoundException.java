package com.localeventmanagementsysytem.localeventmanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class EventFoundException extends RuntimeException {
    public EventFoundException(String message) {
        super(message);
    }
}
