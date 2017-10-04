package wanderer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {

  Map myMap;
  BufferedImage image;
  int posX, posY;

  public PositionedImage(String filename, int posX, int posY) {
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
}