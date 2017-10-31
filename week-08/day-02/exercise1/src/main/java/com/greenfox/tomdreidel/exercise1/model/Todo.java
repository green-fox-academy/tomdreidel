package com.greenfox.tomdreidel.exercise1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {
  @Id
  private int id;
  private String title;
  private boolean isUrgent;
  private boolean isFalse;



}


