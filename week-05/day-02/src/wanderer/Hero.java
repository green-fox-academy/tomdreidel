package wanderer;

import java.util.Random;

public class Hero extends Creature {
  EnemyLayout myEnemyList;
  Creature actualEnemy;

  public Hero(Map myMap, EnemyLayout myEnemies) {
    super("assets/hero-down.png", 0, 0);
    this.myEnemyList = myEnemies;
    this.health = 35;
    this.myMap = myMap;
  }

  @Override
  public void moveLeft() {
    super.moveLeft();
    this.setImageFile("assets/hero-left.png");
    fightScan();
    }

  @Override
  public void moveRight() {
    super.moveRight();
    this.setImageFile("assets/hero-right.png");
    fightScan();
  }

  @Override
  public void moveUp() {
    super.moveUp();
    this.setImageFile("assets/hero-up.png");
    fightScan();
  }

  @Override
  public void moveDown() {
    super.moveDown();
    this.setImageFile("assets/hero-down.png");
    fightScan();
  }

  public void fight(Creature actualEnemy) {
    this.isFight = true;
    actualEnemy.isFight = true;
    Random generator = new Random();

    while (this.health >= 0 && actualEnemy.health >= 0) {
      int enemyHit = 5 + generator.nextInt(5);

      if (this.health < 0) {
        System.out.println("Game over");
        break;
      }
      this.health -= enemyHit;
    }
    this.isFight = false;
  }

  public void hit() {
    Random hit = new Random();
    if (actualEnemy.posX == this.posX && actualEnemy.posY == this.posY) {
      actualEnemy.health -= (5 + hit.nextInt(6));
      if (actualEnemy.health < 1) {
        myEnemyList.die(actualEnemy);
      }
    }

  }

  public void fightScan() {
    for (int i = 0; i < this.myEnemyList.size(); i++) {
      if (myEnemyList.get(i).posX == this.posX && myEnemyList.get(i).posY == this.posY) {
        actualEnemy = myEnemyList.get(i);

      }
    }
  }



}