public class Animal {
  //  Create Animal class
  //  Every animal has a hunger value, which is a whole number
  //  Every animal has a thirst value, which is a whole number
  //  When creating a new animal object these values are created with the default 50 value
  //  Every animal can eat() which decreases their hunger by one
  //  Every animal can drink() which decreases their thirst by one
  //  Every animal can play() which increases both by one

  int hunger;
  int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  void eat() {
    hunger -= 1;
  }

  void drink() {
    thirst -= 1;
  }

  void play() {
    hunger += 1;
    thirst += 1;
  }

  public static void main(String[] args) {
    Animal lion = new Animal();

    System.out.println("New lion:");
    System.out.println("Hunger: " + lion.hunger);
    System.out.println("Thirst: " + lion.thirst);
    System.out.println("--------");

    System.out.println("The lion drinks:");
    lion.drink();
    System.out.println("Hunger: " + lion.hunger);
    System.out.println("Thirst: " + lion.thirst);
    System.out.println("--------");

    System.out.println("The lion plays:");
    lion.play();
    System.out.println("Hunger: " + lion.hunger);
    System.out.println("Thirst: " + lion.thirst);
    System.out.println("--------");

    System.out.println("The lion eats:");
    lion.eat();
    System.out.println("Hunger: " + lion.hunger);
    System.out.println("Thirst: " + lion.thirst);
    System.out.println("--------");
  }
}