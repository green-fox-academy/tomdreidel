package wanderer;

public class Skeleton extends Creature {

  public Skeleton(int posX, int posY, Map map) {
    super("assets/skeleton.png", posX, posY);
    this.health = 10;
    this.myMap = map;
  }
}