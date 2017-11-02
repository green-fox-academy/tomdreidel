package com.greenfox.tomdreidel.todo.models;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.tomcat.jni.Time;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;
  private String title;
  private boolean isUrgent;
  private boolean isCompleted;
  private Timestamp dateCreated;

  public Todo(String title) {
    this.title = title;
    this.dateCreated = Timestamp.valueOf(LocalDateTime.now());
  }

  public Todo() {
    this.dateCreated = Timestamp.valueOf(LocalDateTime.now());

  }

  public String elapsedTime() {
    long minutes = Duration.between(this.dateCreated.toLocalDateTime(), LocalDateTime.now()).toMinutes();
    return (minutes < 60) ? minutes + " minutes ago" : minutes / 60 + " hours ago";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean getIsCompleted() {
    return isCompleted;
  }

  public void setIsCompleted(boolean completed) {
    isCompleted = completed;
  }

  public Timestamp getDateCreated() {
    return dateCreated;
  }

}