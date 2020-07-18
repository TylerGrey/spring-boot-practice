package com.example.demo.service;

import com.example.demo.dto.mapper.UserMapper;
import com.example.demo.dto.model.user.UserDto;
import com.example.demo.exception.CustomizedException;
import com.example.demo.exception.ExceptionType;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getUsers() {
        List<UserDto> users = userRepository.findAll().stream().map(user -> UserMapper.toUserDto(user))
                .collect(Collectors.toList());

        return users;
    }

    @Override
    public UserDto signUp(UserDto userDto) {
        User user = userRepository.findByEmail(userDto.getEmail());

        if (user == null) {
            User userModel = new User().setEmail(userDto.getEmail()).setPassword(userDto.getPassword());
            return UserMapper.toUserDto(userRepository.save(userModel));
        }

        throw CustomizedException.throwException(ExceptionType.DUPLICATE_ENTITY, "duplicated email");
    }

}