package com.greenfox.tomdreidel.exercise1.controller;

import com.greenfox.tomdreidel.exercise1.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping("/todo")
  public String list(Model model) {
  model.addAttribute("todoRepository", todoRepository.findAll());
  return "todo";
  }

  @RequestMapping(value={"/", "/list"})
  @ResponseBody
  public String todo() {
  return "This is my first todo";
  }
}