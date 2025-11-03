package com.localeventmanagementsysytem.localeventmanagementsystem.service;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.UserDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.User;
import com.localeventmanagementsysytem.localeventmanagementsystem.exception.UserAlreadyExistsException;
import com.localeventmanagementsysytem.localeventmanagementsystem.exception.UserNotFoundException;
import com.localeventmanagementsysytem.localeventmanagementsystem.mapper.UserMapper;
import com.localeventmanagementsysytem.localeventmanagementsystem.repository.UserRepository;
import com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface.UserServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceInterface {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        userRepository.findByUsername(userDto.getUsername()).ifPresent(u -> {
            throw new UserAlreadyExistsException("User already exists with username: " + userDto.getUsername());
        });
        User user = userMapper.toUserEntity(userDto);
        user = userRepository.save(user);
        return userMapper.toUserDto(user);
    }

    @Override
    public UserDto getUserById(Long id) {
        return userRepository.findById(id).map(userMapper::toUserDto).orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(userMapper::toUserDto).collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        User existingUser = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
        existingUser.setUsername(userDto.getUsername());
        existingUser = userRepository.save(existingUser);
        return userMapper.toUserDto(existingUser);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDto getUserByUsername(String username) {
        return userRepository.findByUsername(username).map(userMapper::toUserDto).orElseThrow(() -> new UserNotFoundException("User not found with username: " + username));
    }
}
