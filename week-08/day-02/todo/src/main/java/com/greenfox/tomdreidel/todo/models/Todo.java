package com.greenfox.tomdreidel.todo.models;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int id;
  private String title;
  private boolean isUrgent;
  private boolean isCompleted;
  private Timestamp dateCreated;
  private Timestamp dateDue;
  @OneToMany
  List<Assignee> assigneeList = new ArrayList<>();

  public Todo(String title) {
    this.title = title;
    this.dateCreated = Timestamp.valueOf(LocalDateTime.now());
  }

  public Todo() {
    this.dateCreated = Timestamp.valueOf(LocalDateTime.now());
    this.dateDue = Timestamp.valueOf(LocalDateTime.now().plusHours(24));


  }

  public String elapsedTime() {
    long minutes = Duration.between(this.dateCreated.toLocalDateTime(), LocalDateTime.now()).toMinutes();
    return (minutes < 60) ? minutes + " minutes ago" : minutes / 60 + " hours ago";
  }

  public String dateDue() {
    long toDue = Duration.between(LocalDateTime.now(), this.dateDue.toLocalDateTime()).toMinutes();
    if (toDue > 0) {
      return "Due in " + ((toDue < 60) ? toDue + " minutes" : toDue / 60 + " hours");
    }
    else {
      return "Overdue";
    }
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


  public void setDateDue(Timestamp dateDue) {
    this.dateDue = dateDue;
  }
}