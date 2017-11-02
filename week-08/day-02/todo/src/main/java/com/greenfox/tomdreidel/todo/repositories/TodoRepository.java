package com.greenfox.tomdreidel.todo.repositories;

import com.greenfox.tomdreidel.todo.models.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
  @Query(value = "SELECT * FROM todo WHERE is_completed = 0", nativeQuery = true)
  public List<Todo> filterActive();

  public List<Todo> findAllByIsCompletedIsFalse();

  public List<Todo> findAllByTitleContains(String search);

}