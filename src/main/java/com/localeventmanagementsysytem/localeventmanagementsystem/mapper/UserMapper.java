package com.localeventmanagementsysytem.localeventmanagementsystem.mapper;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.UserDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toUserDto(User user);
    User toUserEntity(UserDto userDto);
}
