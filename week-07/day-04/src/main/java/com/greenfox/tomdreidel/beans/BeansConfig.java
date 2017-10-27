package com.greenfox.tomdreidel.beans;

import com.greenfox.tomdreidel.beans.model.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

  @Bean
  public HelloWorld helloWorld() {
    return new HelloWorld();
  }
}