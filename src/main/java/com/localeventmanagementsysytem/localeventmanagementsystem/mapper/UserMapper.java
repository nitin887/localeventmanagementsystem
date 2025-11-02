package com.localeventmanagementsysytem.localeventmanagementsystem.mapper;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.security.core.userdetails.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "password", ignore = true)
    User toUserEntity(UserDto userDto);

    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "password", ignore = true)
    UserDto toUserDto(User user);
}
