package garden;

import java.util.ArrayList;

public class Garden {
  ArrayList<Plant> plants;

  public Garden() {
    this.plants = new ArrayList<>();
  }

  public void water(int number) {
    int thirstyPlants = 0;
    for (Plant plant : plants) {
      if (plant.waterLevel < plant.waterThreshold) {
        thirstyPlants ++;
      }
    }
    if (thirstyPlants < 1) {
      return;
    }
    for (Plant thirstyPlant : plants) {
      if (thirstyPlant.waterLevel < thirstyPlant.waterThreshold) {
        thirstyPlant.waterLevel += (number / thirstyPlants) * (thirstyPlant.waterAbsorption / 100);
      }
    }
  }
}

  //  is able to hold unlimited amount of flowers or trees
  //  when watering it should only water those what needs water with equally divided amount amongst them
  //  eg. watering with 40 and 4 of them need water then each gets watered with 10