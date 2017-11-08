package com.greenfox.tomdreidel.restful.model;

public class GreetingError {

  private String error;

  public GreetingError(String type) {
    this.error = "Please provide a " + type + "!";
  }

  public String getError() {
    return error;
  }

}
