import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

    public static void mainDraw(Graphics graphics){
      // draw a box that has different colored lines on each edge.

      int[] xCoordinates = {50, 150, 150, 50};
      int[] yCoordinates = {50, 50, 150, 150};

      for (int i = 0; i < 4; i++) {
        if (i == 3) {
          graphics.setColor(new Color (255 - i * 20,i * 20,i * 20));
          graphics.drawLine(xCoordinates[i], yCoordinates[i], xCoordinates[i - 3], yCoordinates[i - 3]);
          break;
        }
        graphics.setColor(new Color (i * 50,255 - i * 50,255 - i * 50));
        graphics.drawLine(xCoordinates[i], yCoordinates[i], xCoordinates[i + 1], yCoordinates[i + 1]);
      }
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
