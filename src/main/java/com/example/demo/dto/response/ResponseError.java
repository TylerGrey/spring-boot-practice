package com.example.demo.dto.response;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class ResponseError {
  private Date timestamp;
  private String message;
  private String details;
}