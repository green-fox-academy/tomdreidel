package com.greenfox.tomdreidel.helloworld.controllers;

import com.greenfox.tomdreidel.helloworld.Hellos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWebController {

  @RequestMapping("/hello")
  @ResponseBody
  public String hello() {
    return "Hello World!";
  }

  @RequestMapping("/greeting/template")
  public String greeting(Model model, @RequestParam(value = "name", defaultValue = "World") String name) {
    model.addAttribute("name", name);
    model.addAttribute("counter", HelloRESTController.getCounter().getAndIncrement());
    return "greeting";
  }

  @RequestMapping("/greeting/all")
  public String greetall(Model model, @RequestParam(value = "name", defaultValue = "World") String name) {
    model.addAttribute("name", name);
    model.addAttribute("hellos", new Hellos());

    return "greetall";
  }
}