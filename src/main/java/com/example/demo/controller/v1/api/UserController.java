package com.example.demo.controller.v1.api;

import com.example.demo.dto.response.Response;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/users")
  public Response getUsers() {
    return Response.ok().setPayload(userService.getUsers());
  }

}