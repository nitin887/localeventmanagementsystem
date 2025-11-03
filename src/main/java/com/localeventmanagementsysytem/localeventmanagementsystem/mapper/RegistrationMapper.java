package com.localeventmanagementsysytem.localeventmanagementsystem.mapper;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.RegistrationDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Registration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RegistrationMapper {
    @Mapping(source = "event.id", target = "eventId")
    @Mapping(source = "user.id", target = "userId")
    RegistrationDto toRegistrationDto(Registration registration);

    @Mapping(source = "eventId", target = "event.id")
    @Mapping(source = "userId", target = "user.id")
    Registration toRegistrationEntity(RegistrationDto registrationDto);
}
