package com.greenfox.tomdreidel.chatfactory.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by tomdreidel on 2017. 11. 16..
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {

    private String username;
    private String text;

    public Message(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public Message() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
