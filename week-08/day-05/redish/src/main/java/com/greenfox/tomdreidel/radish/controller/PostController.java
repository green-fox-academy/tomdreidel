package com.greenfox.tomdreidel.radish.controller;

import com.greenfox.tomdreidel.radish.model.Post;
import com.greenfox.tomdreidel.radish.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/radish")
public class PostController {

  @Autowired
  PostService postService;

  @RequestMapping("/posts")
  public String listPosts(Model model) {
    model.addAttribute("allPosts", postService.listAll());
    return "posts";
  }

  @RequestMapping("/posts/{id}/increase")
  public String increaseRank(@PathVariable long id) {
    postService.increaseRank(id);
    return "redirect:/radish/posts";
  }

  @RequestMapping("/posts/{id}/decrease")
  public String decreaseRank(@PathVariable long id) {
    postService.decreaseRank(id);
    return "redirect:/radish/posts";
  }

  @GetMapping("/posts/add")
  public String newPost(Model model) {
    model.addAttribute("post", new Post());
    return "add";
  }

  @PostMapping("/posts/add")
  public String addPost(@ModelAttribute Post post) {
    postService.addPost(post);
    return "redirect:/radish/posts";
  }
}
