package com.greenfox.tomdreidel.helloworld.controllers;

public class Greeting {
  private long id;
  private String content;
  private int fontSize;
  private String rgbColor;

  public Greeting(long id, String content) {

    this.id = id;
    this.content = content;
  }

  public int getFontSize() {
    return fontSize;
  }

  @Override
  public String toString() {
    return content + " " + fontSize + " " + rgbColor;
  }

  public String getRgbColor() {
    return rgbColor;
  }

  public Greeting(String content, int fontSize, String color) {

    this.content = content;
    this.fontSize = fontSize;
    this.rgbColor = color ;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}