package com.example.demo.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseEntity {

  private String email;
  private String password;

}