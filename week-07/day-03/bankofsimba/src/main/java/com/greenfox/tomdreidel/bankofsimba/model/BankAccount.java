package com.greenfox.tomdreidel.bankofsimba.model;

public class BankAccount {
  private long id;
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean goodGuy;

  public BankAccount(String name, double balance,
      String animalType, boolean isKing, boolean goodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.goodGuy = goodGuy;
  }

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public void setIsKing(boolean king) {
    isKing = king;
  }

  public void setGoodGuy(boolean goodGuy) {
    this.goodGuy = goodGuy;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance += balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean getIsKing() {
    return isKing;
  }

  public boolean isGoodGuy() {
    return goodGuy;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

}