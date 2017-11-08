package com.greenfox.tomdreidel.restful.model;

public class Appenda {

  private String appended;

  public Appenda(String appendable) {
    this.appended = appendable + "a";
  }

  public String getAppended() {
    return appended;
  }
}
