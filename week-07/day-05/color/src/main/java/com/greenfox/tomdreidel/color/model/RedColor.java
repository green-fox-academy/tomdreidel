package com.greenfox.tomdreidel.color.model;

public class RedColor implements MyColor {

  String color;
  public RedColor() {
    this.color = "red";
  }

  @Override
  public void printColor() {
    System.out.println("It is " + color + " in color...");
  }
}
