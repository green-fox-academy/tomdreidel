import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HexaMonster {

  public static void mainDraw(Graphics graphics) {

    int iterations = 6;
    int hexaSize = 200;
    int posX = (WIDTH - hexaSize) / 2;
    int posY = (HEIGHT - hexaSize) / 2;

    graphics.setColor(Color.DARK_GRAY);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);

    hexaDrawer(graphics, posX, posY, hexaSize, iterations);
  }

  private static void hexaDrawer(Graphics graphics, int posX, int posY, int hexaSize,
      int iterations) {

    int posX1 = posX;
    int posY1 = posY;
    int posX2 = posX + hexaSize;
    int posY2 = posY;

    if (iterations == 0) {
      return;
    }
    // do it with polygons next time
    graphics.setColor(Color.WHITE);
    graphics.drawLine(posX1, posY1, posX2, posY2); // edge #1
    posX1 = posX2;
    posY1 = posY2;
    posX2 = posX2 + hexaSize / 2;
    posY2 = posY2 + (int) (hexaSize / 2 * (Math.sqrt(3)));
    graphics.drawLine(posX1, posY1, posX2, posY2); // edge #2
    posX1 = posX2;
    posY1 = posY2;
    posX2 = posX2 - hexaSize / 2;
    posY2 = posY2 + (int) (hexaSize / 2 * (Math.sqrt(3)));
    graphics.drawLine(posX1, posY1, posX2, posY2); // edge #3
    posX1 = posX2;
    posY1 = posY2;
    posX2 = posX2 - hexaSize;
    posY2 = posY2;
    graphics.drawLine(posX1, posY1, posX2, posY2); // edge #4
    posX1 = posX2;
    posY1 = posY2;
    posX2 = posX2 - hexaSize / 2;
    posY2 = posY2 - (int) (hexaSize / 2 * (Math.sqrt(3)));
    graphics.drawLine(posX1, posY1, posX2, posY2); // edge #5
    posX1 = posX2;
    posY1 = posY2;
    posX2 = posX;
    posY2 = posY;
    graphics.drawLine(posX1, posY1, posX2, posY2); // edge #6

    hexaDrawer(graphics, posX, posY, hexaSize / 2, iterations - 1);
    hexaDrawer(graphics, posX + hexaSize * 3 / 4, posY + (int) (hexaSize / 4 * (Math.sqrt(3))), hexaSize / 2, iterations - 1);
    hexaDrawer(graphics, posX, posY + (int) (hexaSize / 2 * (Math.sqrt(3))), hexaSize / 2, iterations - 1);
  }


  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Hexagonator");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}

//    if (hex == 0) {
//      return;
//    }
//    if (hex == 1) {
//      posX2 = posX;
//      posY2 = posY;
//      hexaDrawer(graphics, posX, posY, hexaSize);
//    }
