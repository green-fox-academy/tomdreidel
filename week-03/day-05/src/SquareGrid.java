import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SquareGrid {

  public static void mainDraw(Graphics graphics, Graphics2D graphics2D) {

    int squareSize = 600;
    int posX = (WIDTH - squareSize) / 2;
    int posY = (HEIGHT - squareSize) / 2;
    int iteration = 4;
    int lineWeight = 24;

    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(posX, posY, squareSize, squareSize);

    getGrid(graphics2D, graphics, posX, posY, squareSize, iteration, lineWeight);
  }

  private static void getGrid(Graphics2D graphics2D, Graphics graphics, int posX,
      int posY, int squareSize,
      int iteration, int lineWeight) {

    if (iteration == 0) {
      return;
    }

    graphics2D.setStroke(new BasicStroke(lineWeight));
    graphics.setColor(Color.BLACK);
    graphics.drawRect(posX + squareSize / 4, posY + squareSize / 4, squareSize / 2, squareSize / 2);

    getGrid(graphics2D, graphics, posX, posY, squareSize / 2, iteration - 1, lineWeight / 2);
    getGrid(graphics2D, graphics, posX + squareSize / 2, posY, squareSize / 2, iteration - 1,
        lineWeight / 2);
    getGrid(graphics2D, graphics, posX + squareSize / 2, posY + squareSize / 2, squareSize / 2, iteration - 1,
        lineWeight / 2);
    getGrid(graphics2D, graphics, posX, posY + squareSize / 2, squareSize / 2, iteration - 1,
        lineWeight / 2);
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
      Graphics2D graphics2D = (Graphics2D) graphics;
      super.paintComponent(graphics);
      mainDraw(graphics, graphics2D);
    }
  }
}