package com.greenfox.tomdreidel.exercise1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;
  private String title;
  private boolean isUrgent;
  private boolean isFalse;

  public Todo(String title) {
    this.title = title;
  }

  public Todo() {
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean isFalse() {
    return isFalse;
  }

  public void setFalse(boolean aFalse) {
    isFalse = aFalse;
  }
}