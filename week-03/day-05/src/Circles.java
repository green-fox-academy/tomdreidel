import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circles {

  public static void mainDraw(Graphics graphics) {

    int circleRadius = 300;
    int posX = (WIDTH - 2 * circleRadius) / 2;
    int posY = (HEIGHT - 2 * circleRadius) / 2;
    int iteration = 5;

    circulator(graphics, posX, posY, circleRadius, iteration);

    graphics.setColor(Color.DARK_GRAY);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
  }

  private static void circulator(Graphics graphics, int posX, int posY, int circleRadius,
      int iteration) {

    if (iteration == 0) {
      return;
    }

    graphics.setColor(Color.WHITE);
    graphics.drawOval(posX, posY, circleRadius, circleRadius);


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