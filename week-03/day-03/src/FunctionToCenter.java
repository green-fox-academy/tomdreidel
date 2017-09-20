import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void mainDraw(Graphics graphics){
      // create a line drawing function that takes 2 parameters:
      // the x and y coordinates of the line's starting point
      // and draws a line from that point to the center of the canvas.
      // fill the canvas with lines from the edges, every 20 px, to the center.

      int lineStep = 20;

      for (int i = 0; i < WIDTH / 20; i++) {
        lineDrawer(graphics, i * lineStep, 0);
      }
      for (int i = 0; i < WIDTH / 20; i++) {
        lineDrawer(graphics, i * lineStep, HEIGHT);
      }
      for (int i = 0; i < HEIGHT / 20; i++) {
        lineDrawer(graphics, 0, i * lineStep);
      }
      for (int i = 0; i <= HEIGHT / 20; i++) {
        lineDrawer(graphics, WIDTH, i * lineStep);
      }
    }

  private static void lineDrawer(Graphics graphics, int xPoint, int yPoint) {
    graphics.drawLine(xPoint, yPoint, WIDTH / 2, HEIGHT / 2);
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
