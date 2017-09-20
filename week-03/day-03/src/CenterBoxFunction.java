import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
      // create a square drawing function that takes 1 parameter:
      // the square size
      // and draws a square of that size to the center of the canvas.
      // draw 3 squares with that function.

      int[] squareSize = {240, 180, 120};

      for (int i = 0; i < 3; i++) {
        squareBuilder(graphics, squareSize[i]);
      }
    }

  private static void squareBuilder(Graphics graphics, int squareSize) {
    graphics.drawRect((WIDTH - squareSize) / 2, (HEIGHT - squareSize) / 2, squareSize, squareSize);
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
