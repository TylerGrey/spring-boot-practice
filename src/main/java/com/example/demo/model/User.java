package com.example.demo.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class User extends BaseEntity {

  private String email;
  private String password;

}