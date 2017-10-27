package com.greenfox.tomdreidel.beans;

import com.greenfox.tomdreidel.beans.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansApplication implements CommandLineRunner {
  @Autowired
  HelloWorld wut;

	public static void main(String[] args) {
		SpringApplication.run(BeansApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
	  wut.setMessage("Hello World");
    wut.getMessage();
  }
}