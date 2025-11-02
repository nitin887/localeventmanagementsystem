package com.localeventmanagementsysytem.localeventmanagementsystem.mapper;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.RegistrationDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Registration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RegistrationMapper {

    Registration toRegistrationEntity(RegistrationDto registrationDto);
    RegistrationDto toRegistrationDto(Registration registration);
}
