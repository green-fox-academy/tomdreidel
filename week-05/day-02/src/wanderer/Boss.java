package wanderer;

public class Boss extends PositionedImage {

  public Boss(int posX, int posY) {
    super("assets/boss.png", posX, posY, myMap);
  }
}