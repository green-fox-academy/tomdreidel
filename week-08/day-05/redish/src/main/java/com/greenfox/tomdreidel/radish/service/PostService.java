package com.greenfox.tomdreidel.radish.service;

import com.greenfox.tomdreidel.radish.model.Post;
import com.greenfox.tomdreidel.radish.repository.PostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  @Autowired
  PostRepository postRepository;

  public List<Post> listAll() {
    return postRepository.rankedList();
  }

  public void increaseRank(long id) {
    Post tempPost = postRepository.findOne(id);
    int tempRank = tempPost.getPostRank();
    tempPost.setPostRank(tempRank + 1);
    postRepository.save(tempPost);
  }

  public void decreaseRank(long id) {
    Post tempPost = postRepository.findOne(id);
    int tempRank = tempPost.getPostRank();
    tempPost.setPostRank(tempRank - 1);
    postRepository.save(tempPost);
  }

  public void addPost(Post post) {
    postRepository.save(post);
  }
}
