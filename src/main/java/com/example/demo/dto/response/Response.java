package com.example.demo.dto.response;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Response<T> {

  private Status status;
  private T payload;
  private Object errors;
  private Object metadata;

  public static <T> Response<T> ok() {
    Response<T> response = new Response<>();
    response.setStatus(Status.OK);
    return response;
  }

  public static <T> Response<T> duplicateEntity() {
    Response<T> response = new Response<>();
    response.setStatus(Status.DUPLICATE_ENTITY);
    return response;
  }

  public void addErrorMsgToResponse(String errorMsg, Exception exception) {
    ResponseError error = new ResponseError().setDetails(exception.getCause().getMessage())
        .setMessage(exception.getMessage()).setTimestamp(new Date());
    setErrors(error);
  }

  public enum Status {
    OK, BAD_REQUEST, UNAUTHORIZED, VALIDATION_EXCEPTION, EXCEPTION, WRONG_CREDENTIALS, ACCESS_DENIED, NOT_FOUND,
    DUPLICATE_ENTITY
  }

}