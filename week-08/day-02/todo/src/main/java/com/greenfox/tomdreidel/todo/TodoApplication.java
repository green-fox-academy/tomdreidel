package com.greenfox.tomdreidel.todo;

import com.greenfox.tomdreidel.todo.models.Todo;
import com.greenfox.tomdreidel.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

	@Autowired
  TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	  todoRepository.save(new Todo("My first todo in mySQL"));
	  todoRepository.save(new Todo("My second todo in mySQL"));

	}
}
