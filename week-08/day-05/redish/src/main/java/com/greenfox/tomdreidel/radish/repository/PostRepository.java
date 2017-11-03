package com.greenfox.tomdreidel.radish.repository;

import com.greenfox.tomdreidel.radish.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}