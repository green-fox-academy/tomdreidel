package com.greenfox.tomdreidel.color;

import com.greenfox.tomdreidel.color.model.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorApplication implements CommandLineRunner {
  @Autowired
  RedColor red;

	public static void main(String[] args) {
		SpringApplication.run(ColorApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {

	  red.printColor();
  }
}
