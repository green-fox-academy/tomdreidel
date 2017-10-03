package wanderer;

import java.util.ArrayList;

public class Map extends ArrayList<Wall> {

  public Map() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (Math.random() > 0.8) {
          this.add(new Wall(i, j));
        }
      }
    }
  }

  public boolean isWall(int posX, int posY) {
    for (int i = 0; i < this.size(); i++) {
      if (this.get(i).posX == posX && this.get(i).posY == posY) {
        return true;
      }
    }
    return false;
  }
}