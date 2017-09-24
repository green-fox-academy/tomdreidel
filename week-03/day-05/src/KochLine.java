import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KochLine {

  public static void mainDraw(Graphics graphics) {

    int lineLength = 600;
    int posX = (WIDTH - lineLength) / 2;
    int posY = HEIGHT / 2;
    int angleFirst = 0;
    int iteration = 0;

    graphics.setColor(new Color(255, 199, 38));
    graphics.fillRect(0, 0, WIDTH, HEIGHT);

    kochBroccoli(graphics, posX, posY, lineLength, iteration, angleFirst);
  }

  private static void kochBroccoli(Graphics graphics, int posX, int posY, int lineLength,
      int iteration, int angleFirst) {
    if (iteration == 6) {
      return;
    }

    angleFirst += iteration * 60;

    double sin = Math.sin(angleFirst);
    double cos = Math.cos(angleFirst);

    int startX = posX;
    int startY = posY;
    int endX = posX + lineLength;
    int endY = posY;

    int firstX = posX + lineLength / 3;
    int firstY = posY;
    int middleX = posX + lineLength / 2;
    int middleY = (int)(posY - lineLength / 3 / 3 * Math.sqrt(3));
    int lastX = posX + lineLength * 2 / 3;
    int lastY = posY;

    graphics.setColor(new Color(120, 157, 38));

    graphics.drawLine(startX, startY, endX, endY);
    graphics.drawLine(firstX, firstY, middleX, middleY);
    graphics.drawLine(middleX, middleY, lastX, lastY);

    graphics.setColor(new Color(255, 199, 38));
    graphics.drawLine(firstX, firstY, lastX, lastY);


    kochBroccoli(graphics, startX, startY, lineLength / 3, iteration + 1, angleFirst);
    kochBroccoli(graphics, firstX, firstY, lineLength / 3, iteration + 1, angleFirst);
    kochBroccoli(graphics, middleX, middleY, lineLength / 3, iteration + 1, angleFirst);
    kochBroccoli(graphics, lastX, lastY, lineLength / 3, iteration + 1, angleFirst);

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