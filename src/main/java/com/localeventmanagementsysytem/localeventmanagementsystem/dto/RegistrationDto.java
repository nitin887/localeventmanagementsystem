package com.localeventmanagementsysytem.localeventmanagementsystem.dto;

import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Event;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {

    private Long id;
    private UserDto userDto;
    private EventDto eventDto;
    private LocalDateTime registrationDate;

}
