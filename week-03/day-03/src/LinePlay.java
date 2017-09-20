import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw(Graphics graphics){
      // reproduce this:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]

      int lineStep = 20;

      for (int i = 1; i < WIDTH / lineStep - 1; i++) {
        graphics.setColor(new Color(52,214,	105));
        graphics.drawLine(0, 50 + i * lineStep, i * lineStep, HEIGHT);
      }
      for (int i = 1; i < HEIGHT / lineStep - 3; i++) {
        graphics.setColor(new Color(176, 36, 233));
        graphics.drawLine(50 + i * lineStep, 0, WIDTH, i * lineStep);
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
