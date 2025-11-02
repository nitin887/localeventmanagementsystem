package com.localeventmanagementsysytem.localeventmanagementsystem.service;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.RegistrationDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.mapper.RegistrationMapper;
import com.localeventmanagementsysytem.localeventmanagementsystem.repository.RegistrationRepository;
import com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface.RegistrationServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistrationService implements RegistrationServiceInterface {
    private RegistrationRepository registrationRepository;
    private RegistrationMapper registrationMapper;
    @Override
    public RegistrationDto createRegistration(RegistrationDto registrationDto) {
        return null;
    }

    @Override
    public RegistrationDto updateRegistration(RegistrationDto registrationDto, Long id) {
        return null;
    }

    @Override
    public RegistrationDto deleteRegistration(Long id) {
        return null;
    }

    @Override
    public List<RegistrationDto> getRegistrationById(Long id) {
        return null;
    }

    @Override
    public List<RegistrationDto> getAllRegistrations() {
        return null;
    }

    @Override
    public List<RegistrationDto> getRegistrationByEvent(String event) {
        return null;
    }

    @Override
    public List<RegistrationDto> getRegistrationByDate(String date) {
        return null;
    }

    @Override
    public List<RegistrationDto> getRegistrationByTime(String time) {
        return null;
    }

    @Override
    public List<RegistrationDto> getRegistrationByLocation(String location) {
        return null;
    }

    @Override
    public List<RegistrationDto> getRegistrationByCategory(String category) {
        return null;
    }

    @Override
    public List<RegistrationDto> getRegistrationByOrganizer(String organizer) {
        return null;
    }
}
