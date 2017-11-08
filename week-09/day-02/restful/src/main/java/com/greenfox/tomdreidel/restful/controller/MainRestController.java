package com.greenfox.tomdreidel.restful.controller;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @RequestMapping("/doubling")
  public String doubling(@RequestParam() Integer input) {
    ObjectNode node = JsonNodeFactory.instance.objectNode();
    if (input == null) {
      node.put("error", "Please provide an input!");
    } else {
    node.put("received", input);
    node.put("result", input * 2);
    }
    return node.toString();
  }

  @ExceptionHandler(Exception.class)
  public String exception() {
    ObjectNode node = JsonNodeFactory.instance.objectNode();
    node.put("error", "Please provide an input!");
    return node.toString();
  }

  @RequestMapping("/greeter")
  public String greeter(@RequestParam() String name, @RequestParam() String title) {
    ObjectNode node = JsonNodeFactory.instance.objectNode();
    if (name == null || title == null) {
      node.put("error", "Please provide an input!");
    } else {
      node.put("welcome_message", "Oh, hi there " + name + ", my dear " + title + "!");
    }
    return node.toString();
  }

  @RequestMapping("/appenda/{appendable}")
  public String doubling(@PathVariable() String appendable) {
    ObjectNode node = JsonNodeFactory.instance.objectNode();
      node.put("appended", appendable + "a");
    return node.toString();
  }

  @RequestMapping("/dountil/{operator}/{number}")
  public String doubling(@PathVariable() String operator, @PathVariable int number) {
    ObjectNode node = JsonNodeFactory.instance.objectNode();
    if (operator.equals("sum")) {
      int result = 0;
      for (int i = 1; i < number + 1; i++) {
        result += i;
      }
    node.put("until", result);
    }
    else if (operator.equals("factor")) {
      int result = 1;
      for (int i = 1; i < number + 1; i++) {
        result *= i;
      }
      node.put("until", result);
    }
    return node.toString();
  }


}
