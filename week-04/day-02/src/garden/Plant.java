package garden;

public class Plant {
  String color;
  int waterLevel;
  int waterThreshold;
  int waterAbsorption;

  public Plant() {
    this("green", 20, 10);
  }

  public Plant(String color, int waterThreshold, int waterAbsorption) {
    this.color = color;
    this.waterLevel = 0;
    this.waterThreshold = waterThreshold;
    this.waterAbsorption = waterAbsorption;




  }


}