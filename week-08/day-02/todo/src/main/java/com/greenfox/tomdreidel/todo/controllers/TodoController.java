package com.greenfox.tomdreidel.todo.controllers;

import com.greenfox.tomdreidel.todo.models.Todo;
import com.greenfox.tomdreidel.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = {"", "/"})
  public String listCompleted(@RequestParam(value = "isCompleted", required = false, defaultValue = "") String completed, Model model) {
    if (completed.equals("false")) {
      model.addAttribute("todoRepository", todoRepository.filterActive());
    }
    else {
      model.addAttribute("todoRepository", todoRepository.findAll());
    }
    model.addAttribute("count", todoRepository.count());
    model.addAttribute("todo", new Todo());
    return "todo";
  }

  @GetMapping("/add")
  public String add(Model model) {
    model.addAttribute("todo", new Todo());
    return "add";
  }
  @PostMapping("/add")
  public String addTodo(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo";
  }

  @RequestMapping("/delete/{id}")
  public String deleteTodo(@PathVariable int id) {
    todoRepository.delete(id);
    return "redirect:/todo";
  }

  @GetMapping("/edit/{id}")
  public String editTodo(@PathVariable int id, Model model) {
    model.addAttribute("editTodo", todoRepository.findOne(id));
    return "edit";
  }

  @PostMapping("/edit")
  public String saveTodo(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo";
  }

}