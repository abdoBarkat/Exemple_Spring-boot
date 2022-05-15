package com.todos;

public class Todo {
    private int id;
    private String title;
    private String description;

  public Todo(int id ,String title ,String description){
      this.description = description;
      this.title = title;
      this.id = id;
  }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
