package com.greenfox.tomdreidel.helloworld.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  public static AtomicLong getCounter() {
    return counter;
  }

  private static AtomicLong counter = new AtomicLong(1);

  @RequestMapping("/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "Hello World") String name) {
    return new Greeting(counter.getAndIncrement(), name);
  }

  @RequestMapping("/greetingcount")
  @ResponseBody
  public String greetingcount(@RequestParam(value = "name", defaultValue = "Hello World") String name) {
    return "Hello, " + name + "! This site was loaded " + counter.getAndIncrement() + " times since last server start.";
  }
}