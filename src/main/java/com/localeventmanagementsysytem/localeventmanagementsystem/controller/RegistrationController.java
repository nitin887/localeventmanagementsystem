package com.localeventmanagementsysytem.localeventmanagementsystem.controller;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.RegistrationDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface.RegistrationServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
@RequiredArgsConstructor
public class RegistrationController {

    private final RegistrationServiceInterface registrationService;

    @PostMapping
    public ResponseEntity<RegistrationDto> createRegistration(@RequestBody RegistrationDto registrationDto) {
        return new ResponseEntity<>(registrationService.createRegistration(registrationDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistrationDto> getRegistrationById(@PathVariable Long id) {
        return ResponseEntity.ok(registrationService.getRegistrationById(id));
    }

    @GetMapping("/event/{eventId}")
    public ResponseEntity<List<RegistrationDto>> getRegistrationsByEventId(@PathVariable Long eventId) {
        return ResponseEntity.ok(registrationService.getRegistrationsByEventId(eventId));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<RegistrationDto>> getRegistrationsByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(registrationService.getRegistrationsByUserId(userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegistration(@PathVariable Long id) {
        registrationService.deleteRegistration(id);
        return ResponseEntity.noContent().build();
    }
}
