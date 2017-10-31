package com.greenfox.tomdreidel.exercise1;

import com.greenfox.tomdreidel.exercise1.model.Todo;
import com.greenfox.tomdreidel.exercise1.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise1Application implements CommandLineRunner{

  @Autowired
  TodoRepository testTodo;

	public static void main(String[] args) {
		SpringApplication.run(Exercise1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		testTodo.save(new Todo("First todo"));
		testTodo.save(new Todo("Second todo"));
		testTodo.save(new Todo("I have to learn Object Relational Mapping"));
	}
}