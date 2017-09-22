import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sierpinsky {

  public static void mainDraw(Graphics graphics) {

    int squareSize = 600;
    int posX = (WIDTH - squareSize) / 2;
    int posY = (HEIGHT - squareSize) / 2;
    int iteration = 6;

    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(posX, posY, squareSize, squareSize);

    carpetRoller(graphics, posX, posY, squareSize, iteration);
  }

  private static void carpetRoller(Graphics graphics, int posX, int posY, int squareSize,
      int iteration) {

    if (iteration == 0) {
      return;
    }

    graphics.setColor(Color.BLACK);
    graphics.fillRect(posX + squareSize / 3, posY + squareSize / 3, squareSize / 3, squareSize / 3);

    carpetRoller(graphics, posX, posY, squareSize / 3, iteration - 1);
    carpetRoller(graphics, posX + squareSize / 3, posY, squareSize / 3, iteration - 1);
    carpetRoller(graphics, posX + squareSize * 2 / 3, posY, squareSize / 3, iteration - 1);
    carpetRoller(graphics, posX + squareSize * 2 / 3, posY + squareSize / 3, squareSize / 3, iteration - 1);
    carpetRoller(graphics, posX + squareSize * 2 / 3, posY + squareSize * 2 / 3, squareSize / 3, iteration - 1);
    carpetRoller(graphics, posX + squareSize / 3, posY + squareSize * 2 / 3, squareSize / 3, iteration - 1);
    carpetRoller(graphics, posX, posY + squareSize * 2 / 3, squareSize / 3, iteration - 1);
    carpetRoller(graphics, posX, posY + squareSize / 3, squareSize / 3, iteration - 1);
  }

  //    Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("What You Draw Is What You Become... Recursively");
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