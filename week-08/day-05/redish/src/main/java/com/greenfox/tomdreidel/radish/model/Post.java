package com.greenfox.tomdreidel.radish.model;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
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
  private Timestamp dateCreated;

  public Post() {
    this.postRank = 0;
    this.dateCreated = Timestamp.valueOf(LocalDateTime.now());
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

  public String getDateCreated() {
    long minutesAgo = Duration.between(this.dateCreated.toLocalDateTime(), LocalDateTime.now()).toMinutes();
    if (minutesAgo < 2) {
      return "just now";
    }
    else if (minutesAgo >= 2 && minutesAgo < 60) {
      return minutesAgo + " minutes ago";
    }
    else if (minutesAgo >= 60 && minutesAgo < 120) {
      return "about an hour ago";
    }
    else {
      return minutesAgo / 60 + " hours ago";
    }
  }
}