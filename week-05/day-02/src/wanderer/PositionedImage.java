package wanderer;

import java.util.Random;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {

  public static Map myMap;
  BufferedImage image;
  int posX, posY;
  int health;
  int baseDamage;
  int armor;
  boolean isFight;


  public PositionedImage(String filename, int posX, int posY, Map myMap) {
    this.posX = posX;
    this.posY = posY;
    this.myMap = myMap;
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    int tileSize = 72;
    if (image != null) {
      graphics.drawImage(image, posX * tileSize, posY * tileSize, null);
    }
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

  public void setImageFile(String imageFile) {
    try {
      this.image = ImageIO.read(new File(imageFile));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public int getPosX() {
    return posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
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