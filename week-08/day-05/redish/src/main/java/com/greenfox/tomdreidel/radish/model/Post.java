package com.greenfox.tomdreidel.radish.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private long postId;
  private int postRank;
  private String postContent;

  public Post() {
    this.postRank = 0;
  }

  public long getPostId() {
    return postId;
  }

  public void setPostId(long postId) {
    this.postId = postId;
  }

  public int getPostRank() {
    return postRank;
  }

  public void setPostRank(int postRank) {
    this.postRank = postRank;
  }

  public String getPostContent() {
    return postContent;
  }

  public void setPostContent(String postContent) {
    this.postContent = postContent;
  }
}