package com.greenfox.tomdreidel.restful.model;

public class DoUntilError {

  private String error;

  public DoUntilError() {
    this.error = "Please provide a number!";
  }

  public String getError() {
    return error;
  }

}
