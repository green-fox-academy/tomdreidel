package wanderer;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HUD extends PositionedImage {

  Hero myHero;
  EnemyLayout myEnemies;

  public HUD(Hero myHero, EnemyLayout myEnemies) {
    super("assets/skeleton.png", 0, 0);
    this.myHero = myHero;
    this.myEnemies = myEnemies;
  }

  public void drawHUD(Graphics graphics) {
    int origHP = myHero.health;
    Font cb = new Font("Courier New", Font.BOLD, 18);
    String hudInfoLeft =
        "Dungeon " + myHero.mapCount + " | Hero L" + myHero.charLevel + " | HP "
            + myHero.health + "/" + origHP;
    graphics.setFont(cb);
    graphics.setColor(Color.blue);
    graphics.drawString(hudInfoLeft, 10, 740);

    if (myHero.isFight) {

      try {
        graphics.setFont(cb);
        String hudInfoRight =
            "Monster HP: " + myHero.actualEnemy.health + " Monster L: " + myHero.actualEnemy.charLevel;
        graphics.setColor(Color.RED);
        graphics.drawString(hudInfoRight, 370, 740);
      } catch (Exception e) {

      }
    }
  }
}