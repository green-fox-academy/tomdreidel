package com.greenfox.tomdreidel.helloworld;

import com.greenfox.tomdreidel.helloworld.controllers.Greeting;
import java.util.ArrayList;
import java.util.Random;

public class Hellos extends ArrayList<Greeting> {
  private Random generator;
  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  public Hellos() {
    this.generator = new Random();
    for (int i = 0; i < hellos.length; i++) {
      int r = generator.nextInt(255);
      int g = generator.nextInt(255);
      int b = generator.nextInt(255);
      String randomColor = "rgb(" + r + ", " + g + ", " + b + ")";
      this.add(new Greeting(hellos[i] + " ", generator.nextInt(48) + 8, randomColor));
    }
  }
}