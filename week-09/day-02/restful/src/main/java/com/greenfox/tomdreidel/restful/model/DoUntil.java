package com.greenfox.tomdreidel.restful.model;

public class DoUntil {

  private Integer until;
  private String what;
  private int result;

  public DoUntil(Integer until, String what) {
    this.until = until;
  }

  public DoUntil() {
  }

  public int getResult() {
    if (this.what.equals("sum")) {
      for (int i = 1; i < until + 1; i++) {
        this.result += i;
      }
      return this.result;
    }
    else {
      for (int i = 1; i < until + 1; i++) {
        this.result *= i;
      }
      return this.result;
    }
  }

  public void setOperator(String what) {
    this.what = what;
  }

  public Integer getUntil() {
    return until;
  }

  public String getWhat() {
    return what;
  }
}
