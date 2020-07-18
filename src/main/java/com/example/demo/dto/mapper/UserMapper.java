package com.example.demo.dto.mapper;

import com.example.demo.dto.model.user.UserDto;
import com.example.demo.model.User;

import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static UserDto toUserDto(User user) {
        return new UserDto().setEmail(user.getEmail()).setPassword(user.getPassword());
    }

}