package com.greenfox.tomdreidel.todo.controllers;

import com.greenfox.tomdreidel.todo.models.Todo;
import com.greenfox.tomdreidel.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoRestController {

  @Autowired
  TodoRepository todoRepository;

  @PostMapping("/add")
  public String addRestTodo(@RequestBody Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo";
  }

  @RequestMapping("/testrest")
  public Todo addRestTodo() {
    return todoRepository.findOne(50);
  }


}
