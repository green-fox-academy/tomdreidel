package wanderer;

import java.util.ArrayList;
import java.util.Random;

public class EnemyLayout extends ArrayList<Creature> {
  Random generator;
  Map map;

  public EnemyLayout(Map map) {
    this.generator = new Random();
    this.map = map;
    int bossCount = generator.nextInt(4) + 3;
    for (int i = 0; i < bossCount; i++) {
      if (i == 0) {
        int[] position = nextFreeTile();
        this.add(new Boss(position[0], position[1], map, this));
      } else if (i > 0) {
        int[] position = nextFreeTile();
        this.add(new Skeleton(position[0], position[1], map, this));
      }
    }
  }


  public void die(Creature enemy) {
    if (this.size() > 0) {
      this.remove(enemy);
    }
  }

  public boolean collisionScan(int posX, int posY) {
    for (int i = 0; i < this.size(); i++) {
      if (this.get(i).posX == posX && this.get(i).posY == posY) {
      return true;
      }
    }
    return false;
  }

  public int[] nextFreeTile() {
    int[] result = {5, 5};
    while (map.isWall(result[0], result[1]) && !collisionScan(result[0], result[1])) {
    result[0] = generator.nextInt(9) + 1;
    result[1] = generator.nextInt(9) + 1;
    }
    return result;
  }
}