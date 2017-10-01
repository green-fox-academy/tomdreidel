package garden;

public class Flower extends Plant {

  public Flower() {
    this("green", 0, 10, 4);
  }

  public Flower(String color, int waterLevel, int waterThreshold, int waterAbsorption) {
    this.color = color;
    this.waterThreshold = 5;
    this.waterAbsorption = 75;
  }

  //  needs water if its current water amount is less then 5
  //  when watering it the flower can only absorb the 75% of the water
  //  eg. watering with 10 the flower's amount of water should only increase with 7.5

}
