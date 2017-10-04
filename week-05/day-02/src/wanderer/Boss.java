package wanderer;

public class Boss extends Creature {

  public Boss(int posX, int posY, Map map) {
    super("assets/boss.png", posX, posY);
    this.health = 30;
    this.myMap = map;
  }
}