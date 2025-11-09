package com.localeventmanagementsysytem.localeventmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private int statusCode;
    private String message;
    private final LocalDateTime timestamp = LocalDateTime.now();
}