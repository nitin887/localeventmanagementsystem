package com.localeventmanagementsysytem.localeventmanagementsystem.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RegistrationDto {
    private Long id;
    private Long eventId;
    private Long userId;
    private LocalDateTime registrationTime;
}
