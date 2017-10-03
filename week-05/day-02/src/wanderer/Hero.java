package wanderer;

public class Hero extends PositionedImage {

  public Hero(Map myMap) {
    super("assets/hero-down.png", 0, 0, myMap);
  }

  @Override
  public void moveLeft() {
    super.moveLeft();
    this.setImageFile("assets/hero-left.png");
  }

  @Override
  public void moveRight() {
    super.moveRight();
    this.setImageFile("assets/hero-right.png");
  }

  @Override
  public void moveUp() {
    super.moveUp();
    this.setImageFile("assets/hero-up.png");
  }

  @Override
  public void moveDown() {
    super.moveDown();
    this.setImageFile("assets/hero-down.png");
  }
}