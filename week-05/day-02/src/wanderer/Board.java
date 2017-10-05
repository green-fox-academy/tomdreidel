package wanderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  Map myMap;
  Hero myHero;
  EnemyLayout myEnemies;
  HUD myHUD;

  public Board() {

    myMap = new Map();
    myEnemies = new EnemyLayout(myMap);
    myHero = new Hero(myMap, myEnemies);
    myHUD = new HUD(myHero, myEnemies);

    setPreferredSize(new Dimension(720, 800));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        PositionedImage image = new Tile(i, j);
        image.draw(graphics);
      }
    }
    for (int i = 0; i < myMap.size(); i++) {
      myMap.get(i).draw(graphics);
    }
    myHero.draw(graphics);
    myHUD.drawHUD(graphics);


    for (int i = 0; i < myEnemies.size(); i++) {
      myEnemies.get(i).draw(graphics);
    }
  }

  public void run() {
    while (true) {
//      if (System.currentTimeMillis() / 1000000 % 2 == 0) {
//        System.out.println(System.currentTimeMillis() / 1000000);
//      }
      for (Creature c: myEnemies) {
        if (!c.isFight) {
          c.patrolMove();
        }
      }
      repaint();
      nextLevel();
      try {
        Thread.sleep(2000 / myHero.charLevel);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }


  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

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
    else if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
      myHero.hit();
    }
    repaint();

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box

  }

  public Map getMyMap() {
    return myMap;
  }

  public void setMyMap(Map myMap) {
    this.myMap = myMap;
  }
  public void nextLevel() {
    if (myEnemies.size() == 0) {
      myMap = new Map();
      myEnemies = new EnemyLayout(myMap);
      myHero.posX = 0;
      myHero.posY = 0;
      myHero.myMap = myMap;
      myHero.myEnemyList = myEnemies;
      myHero.mapCount ++;

    }


  }
}