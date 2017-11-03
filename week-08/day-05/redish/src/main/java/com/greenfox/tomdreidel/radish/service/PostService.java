package com.greenfox.tomdreidel.radish.service;

import com.greenfox.tomdreidel.radish.model.Post;
import com.greenfox.tomdreidel.radish.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class PostService {

  @Autowired
  PostRepository postRepository;

  public Model listAll(Model model) {
    model.addAttribute("allPosts", postRepository.rankedList());
    return model;
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