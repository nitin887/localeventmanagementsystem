package com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.UserDto;

import java.util.List;

public interface UserServiceInterface {
    //create user
    UserDto createUser(UserDto userDto);
    //update user by id
    UserDto updateUser(UserDto userDto, Long id);
    //delete user by id
    UserDto deleteUser(Long id);
    //get user by id
    List<UserDto> getUserById(Long id);
    //get all users
   List<UserDto> getAllUsers();
    //get user by name
   List<UserDto> getUserByName(String name);
    //get user by email
   List<UserDto> getUserByEmail(String email);


}
