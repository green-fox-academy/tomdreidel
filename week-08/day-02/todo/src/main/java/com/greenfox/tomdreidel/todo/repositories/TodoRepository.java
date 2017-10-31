package com.greenfox.tomdreidel.todo.repositories;

import com.greenfox.tomdreidel.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
}