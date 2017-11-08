package com.greenfox.tomdreidel.restful.model;

public class GreetingResult {

  private String name;
  private String title;
  private String welcome_message;

  public GreetingResult(String name, String title) {
    this.name = name;
    this.title = title;
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }
}
