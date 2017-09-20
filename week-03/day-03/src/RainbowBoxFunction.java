import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){
      // create a square drawing function that takes 2 parameters:
      // the square size, and the fill color,
      // and draws a square of that size and color to the center of the canvas.
      // create a loop that fills the canvas with rainbow colored squares.

      for (int i = 0; i < 20; i++) {
        int squareSize = random8();
        int[] color = {random8(), random8(), random8()};
        dropSquare(graphics, squareSize, color);
      }
    }

  private static void dropSquare(Graphics graphics, int squareSize, int[] color) {
    graphics.setColor(new Color(color[0], color[1], color[2]));
    graphics.fillRect((WIDTH - squareSize) / 2, (HEIGHT - squareSize) / 2, squareSize, squareSize);
  }

  private static int random8() {
    return (int) (Math.random() * 255);
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
