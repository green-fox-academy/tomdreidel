import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

    public static void mainDraw(Graphics graphics){
      // create a line drawing function that takes 2 parameters:
      // the x and y coordinates of the line's starting point
      // and draws a line from that point to the center of the canvas.
      // draw 3 lines with that function.

      int[] xPoints = {0, 45, 175};
      int[] yPoints = {80, 180, 200};

      for (int i = 0; i < 3; i++) {
        centerPointer(graphics, xPoints[i], yPoints[i]);
      }
    }

  private static void centerPointer(Graphics graphics, int xPoint, int yPoint) {
      int centerX = WIDTH / 2;
      int centerY = HEIGHT / 2;
      graphics.drawLine(xPoint, yPoint, centerX, centerY);
  }

  //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
