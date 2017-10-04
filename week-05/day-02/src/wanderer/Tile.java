package wanderer;

public class Tile extends PositionedImage {

  public Tile(int posX, int posY) {
    super("assets/floor.png", posX, posY, myMap);
  }
}