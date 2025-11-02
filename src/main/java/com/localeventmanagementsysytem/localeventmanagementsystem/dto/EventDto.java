package com.localeventmanagementsysytem.localeventmanagementsystem.dto;

import com.localeventmanagementsysytem.localeventmanagementsystem.entity.EventStatus;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {

    private Long id;
    private String title;
    private String description;
    private String category;
    private String location;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer maxAttendees;
    private EventStatus status;
    private UserDto createdBy;
    private LocalDateTime createdAt;
}
