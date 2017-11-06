package com.greenfox.tomdreidel.radish.repository;

import com.greenfox.tomdreidel.radish.model.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

  @Query(value = "SELECT * FROM post ORDER BY post_rank DESC", nativeQuery = true)
  public List<Post> rankedList();

}
