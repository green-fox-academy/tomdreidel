package wanderer;

import java.util.ArrayList;

public class EnemyLayout extends ArrayList<PositionedImage> {

  public EnemyLayout(Map map) {
    int bossCount = (int) (Math.random() * 6);
    for (int i = 0; i < bossCount; i++) {
      int tempX = (int) (Math.random() * 9) + 1;
      int tempY = (int) (Math.random() * 9) + 1;
      while (map.isWall(tempX, tempY)) {
        tempX = (int) (Math.random() * 9) + 1;
        tempY = (int) (Math.random() * 9) + 1;
      }
      if (i == 0) {
        this.add(new Boss("", tempX, tempY));
        tempX = (int) (Math.random() * 9) + 1;
        tempY = (int) (Math.random() * 9) + 1;
        while (map.isWall(tempX, tempY)) {
          tempX = (int) (Math.random() * 9) + 1;
          tempY = (int) (Math.random() * 9) + 1;
        }
      }
      this.add(new Skeleton(tempX, tempY, i));
    }






  }



}