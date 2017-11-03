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


  @Query (value = "select t.* from todo t join assignee_todos j on t.id = j.todos_id join assignee a on j.assignee_assignee_id = a.assignee_id where assignee_id = ?1", nativeQuery = true)
  public List<Todo> searchByAssignee(int assignee_id);


}