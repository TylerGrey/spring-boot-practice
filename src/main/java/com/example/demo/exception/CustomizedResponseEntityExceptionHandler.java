package com.example.demo.exception;

import com.example.demo.dto.response.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(CustomizedException.DuplicateEntityException.class)
  public final ResponseEntity handleDuplicateException(Exception exception) {
    Response response = Response.duplicateEntity();
    response.addErrorMsgToResponse(exception.getMessage(), exception);

    return new ResponseEntity<>(response, HttpStatus.CONFLICT);
  }
}