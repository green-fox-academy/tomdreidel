package wanderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  int tileSize;
  Map myMap;
  Hero myHero;


  public Board() {

    myMap = new Map();
    myHero = new Hero(myMap);

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.



    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        PositionedImage image = new PositionedImage("assets/floor.png", i, j);
        image.draw(graphics);
      }
    }
    for (int i = 0; i < myMap.size(); i++) {
      myMap.get(i).draw(graphics);
    }
    myHero.draw(graphics);


  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      myHero.moveUp();
    }
    else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      myHero.moveDown();
    }
    else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      myHero.moveLeft();
    }
    else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      myHero.moveRight();
    }
    repaint();
  }
}