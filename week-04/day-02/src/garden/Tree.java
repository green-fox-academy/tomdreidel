package garden;

public class Tree extends Plant {

  public Tree() {
    this("green", 0, 10, 4);
  }

  public Tree(String color, int waterLevel, int waterThreshold, int waterAbsorption) {
    this.color = color;
    this.waterThreshold = 10;
    this.waterAbsorption = 40;
  }




  //  needs water if its current water amount is less then 10
  //  when watering it the tree can only absorb the 40% of the water
  //  eg. watering with 10 the tree's amount of water should only increase with 4

}
