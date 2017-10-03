package wanderer;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Hero extends PositionedImage {
  Map myMap;

  public Hero(Map myMap) {
    super("assets/hero-down.png", 0, 0);
    this.myMap = myMap;
  }

  public int getPositionX() {
    return posX;
  }

  public void setPositionX(int posX) {
    this.posX = posX;
  }

  public int getPositionY() {
    return posY;
  }

  public void setPositionY(int posY) {
    this.posY = posY;
  }

  public void setImageFile(String imageFile) {
    try {
      this.image = ImageIO.read(new File(imageFile));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void moveLeft() {
    if (this.getPositionX() > 0 && !myMap.isWall(this.getPositionX() - 1, getPositionY())) {
      this.setPositionX(this.getPositionX() - 1);
      this.setImageFile("assets/hero-left.png");
    }
  }

  public void moveRight() {
    if (this.getPositionX() < 9 && !myMap.isWall(this.getPositionX() + 1, getPositionY())) {
      this.setPositionX(this.getPositionX() + 1);
      this.setImageFile("assets/hero-right.png");
    }
  }

  public void moveUp() {
    if (this.getPositionY() > 0 && !myMap.isWall(this.getPositionX(), getPositionY() - 1)) {
      this.setPositionY(this.getPositionY() - 1);
      this.setImageFile("assets/hero-up.png");
    }
  }

  public void moveDown() {
    if (this.getPositionY() < 9 && !myMap.isWall(this.getPositionX(), getPositionY() + 1)) {
      this.setPositionY(this.getPositionY() + 1);
      this.setImageFile("assets/hero-down.png");
    }
  }
}