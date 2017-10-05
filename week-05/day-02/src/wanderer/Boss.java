package wanderer;

public class Boss extends Creature {

  public Boss(int posX, int posY, Map map, EnemyLayout myEnemyMap) {
    super("assets/boss.png", posX, posY, myEnemyMap);
    this.health = 30;
    this.myMap = map;
  }
}