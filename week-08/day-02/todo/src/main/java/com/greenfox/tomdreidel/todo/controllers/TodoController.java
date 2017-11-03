package com.greenfox.tomdreidel.todo.controllers;

import com.greenfox.tomdreidel.todo.models.Assignee;
import com.greenfox.tomdreidel.todo.models.Todo;
import com.greenfox.tomdreidel.todo.repositories.AssigneeRepository;
import com.greenfox.tomdreidel.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @Autowired
  AssigneeRepository assigneeRepository;

  @RequestMapping(value = {"", "/"})
  public String listCompleted(Model model) {

    model.addAttribute("todoRepository", todoRepository.findAll());
    model.addAttribute("assigneeRepository", assigneeRepository.findAll());
    model.addAttribute("count", todoRepository.count());
    model.addAttribute("todo", new Todo());
    model.addAttribute("editTodo", new Todo());
    return "todo";
  }

  @GetMapping("/active")
  public String active(Model model) {
    model.addAttribute("todoRepository", todoRepository.findAllByIsCompletedIsFalse());
    model.addAttribute("count", todoRepository.count());
    model.addAttribute("todo", new Todo());
    model.addAttribute("editTodo", new Todo());
    return "todo";
  }

//  Search Endpoints

  @PostMapping("/search/{search}")
  public String search(@PathVariable(required = false) String search, Model model) {
    model.addAttribute("todoRepository", todoRepository.findAllByTitleContains(search));
    model.addAttribute("count", todoRepository.count());
    model.addAttribute("todo", new Todo());
    model.addAttribute("editTodo", new Todo());
    return "todo";
  }
  @PostMapping("/search/")
  public String searchBlank() {
    return "redirect:/todo";
  }

//  Add Nex Task

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

//  Delete Item

  @RequestMapping("/delete/{id}")
  public String deleteTodo(@PathVariable int id) {
    todoRepository.delete(id);
    return "redirect:/todo";
  }

//  Edit Existing Task

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

  @RequestMapping("/urgent/{id}")
  public String toggleUrgent(@PathVariable int id) {
    Todo temp = todoRepository.findOne(id);
    temp.setIsUrgent(!temp.getIsUrgent());
    todoRepository.save(temp);
    return "redirect:/todo";
  }

  @RequestMapping("/completed/{id}")
  public String toggleCompleted(@PathVariable int id) {
    Todo temp = todoRepository.findOne(id);
    temp.setIsCompleted(!temp.getIsCompleted());
    todoRepository.save(temp);
    return "redirect:/todo";
  }

//  Show List of Assignees

  @GetMapping("/assignee")
  public String assignees(Model model) {
    model.addAttribute("assigneeRepository", assigneeRepository.findAll());
    model.addAttribute("assignee", new Assignee());
    return "assignee";
  }

  @PostMapping("/assignee/add")
  public String addAssignee(@ModelAttribute Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/todo/assignee";
  }

  @RequestMapping("assignee/delete/{id}")
  public String deleteAssignee(@PathVariable int id) {
    assigneeRepository.delete(id);
    return "redirect:/todo/assignee";
  }

  @RequestMapping("assignee/{id}")
  public String filterAssignee(@PathVariable Integer id, Model model) {
    if (id == null) {
    model.addAttribute("todoRepository", todoRepository.findAll());
    model.addAttribute("count", todoRepository.count());
    }
    else {
    model.addAttribute("todoRepository", todoRepository.searchByAssignee(id));
//    model.addAttribute("todoRepository", todoRepository.findAllByAssigneeListEquals(id));
    model.addAttribute("count", todoRepository.searchByAssignee(id).size());
    }
    model.addAttribute("assigneeRepository", assigneeRepository.findAll());
    model.addAttribute("todo", new Todo());
    model.addAttribute("editTodo", new Todo());
    return "todo";
  }
}