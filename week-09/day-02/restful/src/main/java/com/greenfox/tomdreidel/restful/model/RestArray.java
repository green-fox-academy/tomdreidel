package com.greenfox.tomdreidel.restful.model;

public class RestArray {

  private String what;
  private int[] numbers;
  private int result;
  private int[] resultArray;

  public RestArray() {
  }

  public int[] getNumbers() {
    return numbers;
  }

  public int sumNumbers() {
    for (int i = 0; i < numbers.length; i++) {
      result += numbers[i];
    }
    return result;
  }

  public int multiplyNumbers() {
    result = 1;
    for (int i = 0; i < numbers.length; i++) {
      result *= numbers[i];
    }
    return result;
  }

  public int[] doubleNumbers() {
    for (int i = 0; i < numbers.length; i++) {
      resultArray = numbers;
      resultArray[i] = numbers[i] * 2;
    }
    return resultArray;
  }

  public String getWhat() {
    return what;
  }
}
