package wanderer;

import java.util.ArrayList;
import java.util.Random;

public class Map extends ArrayList<Wall> {

  public Map() {
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        if (Math.random() > 0.6) {
          this.add(new Wall(i, j));
        }
      }
    }
  }

//  public Map() {
//
//
//    drawNeighbor(0, 0, 10, false);
//
//  }
//
//  public void drawNeighbor(int posX, int posY, int iteration, boolean wall) {
//    if (iteration == 0) {
//      return;
//    }
//    if (wall) {
//      this.add(new Wall(posX, posY));
//    }
//    Random generator = new Random();
//    int direction = generator.nextInt(4);
//    switch (direction) {
//      case 0:
//    drawNeighbor(posX + 1, posY, iteration - 1, false);
//
//        break;
//      case 1:
//    drawNeighbor(posX, posY + 1, iteration - 1, false);
//
//        break;
//      case 2:
//
//        break;
//      case 3:
//
//        break;
//    }
//
//
//      drawNeighbor(posX, posY + generator.nextInt(), iteration - 1, generator.nextBoolean());
//
//  }

  public boolean isWall(int posX, int posY) {
    for (int i = 0; i < this.size(); i++) {
      if (this.get(i).posX == posX && this.get(i).posY == posY) {
        return true;
      }
    }
    return false;
  }
}