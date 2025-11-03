package com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.RegistrationDto;

import java.util.List;

public interface RegistrationServiceInterface {
    RegistrationDto createRegistration(RegistrationDto registrationDto);
    RegistrationDto getRegistrationById(Long id);
    List<RegistrationDto> getRegistrationsByEventId(Long eventId);
    List<RegistrationDto> getRegistrationsByUserId(Long userId);
    void deleteRegistration(Long id);
}
