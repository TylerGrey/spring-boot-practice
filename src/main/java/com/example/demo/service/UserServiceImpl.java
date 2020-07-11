package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.dto.mapper.UserMapper;
import com.example.demo.dto.model.user.UserDto;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}