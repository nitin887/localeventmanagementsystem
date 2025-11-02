package com.localeventmanagementsysytem.localeventmanagementsystem.service;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.UserDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.mapper.UserMapper;
import com.localeventmanagementsysytem.localeventmanagementsystem.repository.UserRepository;
import com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface.UserServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceInterface {
    private UserRepository userRepository;
    private UserMapper userMapper;
    @Override
    public UserDto createUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto updateUser(UserDto userDto, Long id) {
        return null;
    }

    @Override
    public UserDto deleteUser(Long id) {
        return null;
    }

    @Override
    public List<UserDto> getUserById(Long id) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public List<UserDto> getUserByName(String name) {
        return null;
    }

    @Override
    public List<UserDto> getUserByEmail(String email) {
        return null;
    }
}
