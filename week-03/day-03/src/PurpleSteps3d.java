import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {

    public static void mainDraw(Graphics graphics){
      // reproduce this:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

      int squareSize = 10;

      for (int i = 0; i < 6; i++) {
        graphics.setColor(new Color(181, 75, 234));
        graphics.fillRect((((i * (i + 1)) / 2) * squareSize) + squareSize, (((i * (i + 1)) / 2) * squareSize) + squareSize, squareSize + (i * squareSize), squareSize + (i * squareSize));
        graphics.setColor(Color.BLACK);
        graphics.drawRect((((i * (i + 1)) / 2) * squareSize) + squareSize, (((i * (i + 1)) / 2) * squareSize) + squareSize, squareSize + (i * squareSize), squareSize + (i * squareSize));
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
