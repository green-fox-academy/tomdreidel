package com.greenfox.tomdreidel.todo.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Assignee {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int assigneeId;
  private String name;
  private String email;
  @OneToMany
  List<Todo> todos = new ArrayList<>();


  public int getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(int assigneeId) {
    this.assigneeId = assigneeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}





//    we should be able to edit the name of any selected Assignee
//    or remove one
//    or add a new one (with the name and email)

//    Extend the Todo edit page to be able to select the Assignee by name
//    On the List of Assignees page we should be able to click on the Assignee to show Todos assigned to the Assignee
//    On the List of Todos we should be able to click on the Assignee to show Todos assigned to the Assignee