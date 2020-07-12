package com.example.demo.exception;

public class CustomizedException {

  public static RuntimeException throwException(ExceptionType exceptionType, String message) {
    if (exceptionType.equals(ExceptionType.DUPLICATE_ENTITY)) {
      return new DuplicateEntityException(message);
    }

    return new RuntimeException(message);
  }

  public static class DuplicateEntityException extends RuntimeException {
    public DuplicateEntityException(String message) {
      super(message);
    }
  }
}