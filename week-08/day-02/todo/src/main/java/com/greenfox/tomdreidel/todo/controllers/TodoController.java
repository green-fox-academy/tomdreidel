package com.greenfox.tomdreidel.todo.controllers;

import com.greenfox.tomdreidel.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping("/todo")
  public String listCompleted(@RequestParam(value = "isCompleted", required = false, defaultValue = "") String completed, Model model) {
    if (completed.equals("false")) {
      model.addAttribute("todoRepository", todoRepository.filterActive());
    }
    else {
      model.addAttribute("todoRepository", todoRepository.findAll());
    }
      return "todo";
  }

  @RequestMapping(value={"/", "/list"})
  @ResponseBody
  public String todo() {
  return "This is my first todo";
  }
}