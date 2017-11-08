package com.greenfox.tomdreidel.restful.model;

public class ArraysError {

  private String error;

  public ArraysError (String type) {
    this.error = "Please provide a " + type + "!";
  }

  public String getError() {
    return error;
  }

}
