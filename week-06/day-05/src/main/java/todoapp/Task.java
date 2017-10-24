package todoapp;

public class Task {

  int order;
  boolean completed;
  String text;
  private final int id;

  public Task(int order, boolean completed, String text, int id) {
    this.order = order;
    this.completed = completed;
    this.text = text;
    this.id = id;
  }
}