package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.model.user.UserDto;

public interface UserService {

    List<UserDto> getUsers();

    UserDto signUp(UserDto userDto);

}