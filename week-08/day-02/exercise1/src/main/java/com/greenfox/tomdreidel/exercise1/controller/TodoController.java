package com.greenfox.tomdreidel.exercise1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

@RequestMapping("/todo")
  public String list(Model model) {
  return "/todo";
}

@RequestMapping(value={"/", "/list"})
@ResponseBody
  public String todo() {
  return "This is my first todo";
}



}
