package com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.RegistrationDto;

import java.util.List;

public interface RegistrationServiceInterface {
    //create registration
    RegistrationDto createRegistration(RegistrationDto registrationDto);
    //update registration by id
    RegistrationDto updateRegistration(RegistrationDto registrationDto, Long id);
    //delete registration by id
    RegistrationDto deleteRegistration(Long id);
    //get registration by id
    List<RegistrationDto> getRegistrationById(Long id);
    //get all registrations
    List<RegistrationDto> getAllRegistrations();
    //get registration by event
    List<RegistrationDto> getRegistrationByEvent(String event);
    //get registration by date
    List<RegistrationDto> getRegistrationByDate(String date);
    //get registration by time
    List<RegistrationDto> getRegistrationByTime(String time);
    //get registration by location
    List<RegistrationDto> getRegistrationByLocation(String location);
    //get registration by category
    List<RegistrationDto> getRegistrationByCategory(String category);
    //get registration by organizer
   List<RegistrationDto> getRegistrationByOrganizer(String organizer);
}
