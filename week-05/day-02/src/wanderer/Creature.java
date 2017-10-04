package wanderer;

import java.util.Random;

public class Creature extends PositionedImage {
  Map myMap;
  int health;
  int baseDamage;
  int armor;
  boolean isFight;

  public Creature(String fileName, int posX, int posY) {
    super(fileName, posX, posY);
  }


  public void moveLeft() {
    if (this.getPosX() > 0 && !myMap.isWall(this.getPosX() - 1, getPosY())) {
      this.setPosX(this.getPosX() - 1);
    }
  }

  public void moveRight() {
    if (this.getPosX() < 9 && !myMap.isWall(this.getPosX() + 1, getPosY())) {
      this.setPosX(this.getPosX() + 1);
    }
  }

  public void moveUp() {
    if (this.getPosY() > 0 && !myMap.isWall(this.getPosX(), getPosY() - 1)) {
      this.setPosY(this.getPosY() - 1);
    }
  }

  public void moveDown() {
    if (this.getPosY() < 9 && !myMap.isWall(this.getPosX(), getPosY() + 1)) {
      this.setPosY(this.getPosY() + 1);
    }
  }

  public void patrolMove(boolean move) {
    if (move) {

      Random generator = new Random();
      switch (generator.nextInt(4)) {
        case 0:
          this.moveUp();
          break;
        case 1:
          this.moveRight();
          break;
        case 2:
          this.moveDown();
          break;
        case 3:
          this.moveLeft();
          break;
      }
    }
  }


}
