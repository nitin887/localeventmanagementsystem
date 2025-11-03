package com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.UserDto;

import java.util.List;

public interface UserServiceInterface {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long id);
    List<UserDto> getAllUsers();
    UserDto updateUser(Long id, UserDto userDto);
    void deleteUser(Long id);
    UserDto getUserByUsername(String username);
}
