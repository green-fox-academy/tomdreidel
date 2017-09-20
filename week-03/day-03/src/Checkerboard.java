import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics){
      // fill the canvas with a checkerboard pattern.

      for (int i = 0; i < 8; i++) {
        int iPass = i;
        if (i % 2 == 0) {
          drawRow(graphics,255, 0, iPass);
        } else {
          drawRow(graphics, 0, 255, iPass);
        }
      }
    }

  private static void drawRow(Graphics graphics, int firstColor, int secondColor, int iterator) {
    int squareSize = WIDTH / 8;
    for (int j = 0; j < 8; j++) {
      if (j % 2 == 0) {
        graphics.setColor(new Color(firstColor, firstColor, firstColor));
        graphics.fillRect(j * squareSize, iterator * squareSize, squareSize, squareSize);
      } else {
        graphics.setColor(new Color(secondColor, secondColor, secondColor));
        graphics.fillRect(j * squareSize, iterator * squareSize, squareSize, squareSize);
      }
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
