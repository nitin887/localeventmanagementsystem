package com.localeventmanagementsysytem.localeventmanagementsystem.service;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.RegistrationDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Registration;
import com.localeventmanagementsysytem.localeventmanagementsystem.exception.RegistrationNotFoundException;
import com.localeventmanagementsysytem.localeventmanagementsystem.mapper.RegistrationMapper;
import com.localeventmanagementsysytem.localeventmanagementsystem.repository.RegistrationRepository;
import com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface.RegistrationServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RegistrationService implements RegistrationServiceInterface {

    private final RegistrationRepository registrationRepository;
    private final RegistrationMapper registrationMapper;

    @Override
    public RegistrationDto createRegistration(RegistrationDto registrationDto) {
        Registration registration = registrationMapper.toRegistrationEntity(registrationDto);
        registration = registrationRepository.save(registration);
        return registrationMapper.toRegistrationDto(registration);
    }

    @Override
    public RegistrationDto getRegistrationById(Long id) {
        return registrationRepository.findById(id).map(registrationMapper::toRegistrationDto).orElseThrow(() -> new RegistrationNotFoundException("Registration not found with id: " + id));
    }

    @Override
    public List<RegistrationDto> getRegistrationsByEventId(Long eventId) {
        return registrationRepository.findByEventId(eventId).stream().map(registrationMapper::toRegistrationDto).collect(Collectors.toList());
    }

    @Override
    public List<RegistrationDto> getRegistrationsByUserId(Long userId) {
        return registrationRepository.findByUserId(userId).stream().map(registrationMapper::toRegistrationDto).collect(Collectors.toList());
    }

    @Override
    public void deleteRegistration(Long id) {
        registrationRepository.deleteById(id);
    }
}
