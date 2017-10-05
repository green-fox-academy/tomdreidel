package wanderer;

public class Skeleton extends Creature {

  public Skeleton(int posX, int posY, Map map, EnemyLayout myEnemyList) {
    super("assets/skeleton.png", posX, posY, myEnemyList);
    this.health = 10;
    this.myMap = map;
  }
}