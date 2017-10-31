package com.greenfox.tomdreidel.exercise1.repository;

import com.greenfox.tomdreidel.exercise1.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
}