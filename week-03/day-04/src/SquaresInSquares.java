import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SquaresInSquares {

  public static void mainDraw(Graphics graphics) {

    int iterations = 4;
    int squareSize = 450;
    int posX = (WIDTH - squareSize) / 2;
    int posY = (HEIGHT - squareSize) / 2;

    graphics.setColor(Color.BLACK);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    squareBuilder(graphics, squareSize, posX, posY, iterations);
  }

  private static void squareBuilder(Graphics graphics, int squareSize, int posX, int posY,
      int iterations) {
    if (iterations < 1) {
      return;
    }

    graphics.setColor(Color.GREEN);
    graphics.drawRect(posX, posY, squareSize, squareSize);
    graphics.drawRect(posX + squareSize / 3, posY, squareSize / 3, squareSize / 3);
    graphics.drawRect(posX, posY + squareSize / 3, squareSize /3, squareSize / 3);
    graphics.drawRect(posX + squareSize / 3, posY + squareSize * 2 / 3, squareSize / 3, squareSize / 3);
    graphics.drawRect(posX + squareSize * 2 / 3, posY + squareSize / 3, squareSize / 3, squareSize / 3);

    squareBuilder(graphics, squareSize / 3, posX + squareSize / 3, posY, iterations - 1);
    squareBuilder(graphics, squareSize / 3, posX + squareSize / 3, posY + squareSize * 2 / 3, iterations - 1);
    squareBuilder(graphics, squareSize / 3, posX, posY + squareSize / 3, iterations - 1);
    squareBuilder(graphics, squareSize / 3, posX + squareSize * 2 / 3, posY + squareSize / 3, iterations - 1);

  }

  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Recursion");
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