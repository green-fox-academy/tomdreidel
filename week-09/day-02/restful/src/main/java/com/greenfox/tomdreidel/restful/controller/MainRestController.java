package com.greenfox.tomdreidel.restful.controller;

import com.greenfox.tomdreidel.restful.model.Appenda;
import com.greenfox.tomdreidel.restful.model.DoUntil;
import com.greenfox.tomdreidel.restful.model.DoUntilError;
import com.greenfox.tomdreidel.restful.model.DoublingError;
import com.greenfox.tomdreidel.restful.model.DoublingResult;
import com.greenfox.tomdreidel.restful.model.GreetingError;
import com.greenfox.tomdreidel.restful.model.GreetingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @RequestMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {

    if (input == null) {
      return new DoublingError();
    }

    else {
      return new DoublingResult(input);
    }
  }

  @RequestMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {

    if (name == null) {
      return new GreetingError("name");
    }

    if (title == null) {
      return new GreetingError("title");
    }

    else {
      return new GreetingResult(name, title).getWelcome_message();
    }
  }

  @RequestMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable() String appendable) {
    return new Appenda(appendable);
  }

  @PostMapping("/dountil/{what}")
  public Object doUntil(@RequestBody(required = false) DoUntil until, @PathVariable String what) {
    if (until == null) {
      return new DoUntilError();
    }

    else {
      until.setOperator(what);
      return until.getResult();
    }
  }
}
