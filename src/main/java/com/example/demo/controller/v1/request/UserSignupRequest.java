package com.example.demo.controller.v1.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignupRequest {

    private String email;
    private String password;
}