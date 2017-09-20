import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics){
      // reproduce this:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/envelope-star/r2.png]

      int lineStep = 10;

      // quarter 1

      for (int i = 0; i < WIDTH / 2 / lineStep - 1; i++) {
        graphics.setColor(new Color(52,214,	105));
        graphics.drawLine(25 + i * lineStep, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 - i * lineStep);
      }

      // quarter 2

      for (int i = 0; i < WIDTH / 2 / lineStep - 1; i++) {
        graphics.setColor(new Color(52,214,	105));
        graphics.drawLine(WIDTH / 2, 25 + i * lineStep, WIDTH / 2 + i * lineStep, HEIGHT / 2);
      }

      // quarter 3

      for (int i = 1; i < HEIGHT / 2 / lineStep - 3; i++) {
        graphics.setColor(new Color(52,214,	105));
        graphics.drawLine(25 + i * lineStep, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + i * lineStep);
      }

      // quarter 4

      for (int i = 1; i < WIDTH / 2 / lineStep - 1; i++) {
        graphics.setColor(new Color(52,214,	105));
        graphics.drawLine(WIDTH / 2 + lineStep + i * lineStep, HEIGHT / 2, WIDTH / 2, HEIGHT - 25 - i * lineStep);
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
