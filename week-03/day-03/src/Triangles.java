import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics){
      // reproduce this:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/triangles/r5.png]

      int triangleBase = 25;
      int[] initialPosition = {WIDTH / 2, 0};
      int triangleHeight = (int) (triangleBase * (Math.sqrt(3)/2));
      int[][] coordinates = pointCalculator(initialPosition, triangleBase, triangleHeight);

      triangleFactory(graphics, coordinates);

      for (int i = 1; i < 22; i++) {
        for (int j = 0; j < i; j++) {
          pointCalculator(coordinates[i], triangleBase, triangleHeight);
          triangleFactory(graphics, coordinates);
        }
        
      }
      
      
    }

  private static int[][] pointCalculator(int[] initialPosition, int triangleBase,
      int height) {
      int[][] coordinates = {{initialPosition[0], initialPosition[1]}, {(initialPosition[0] - triangleBase / 2), (initialPosition[1] + height)}, {(initialPosition[0] + triangleBase / 2), (initialPosition[1] + height)}};
      return coordinates;
  }

  private static void triangleFactory(Graphics graphics, int[][] coordinates) {
    for (int i = 0; i < coordinates.length; i++) {
      if (i == coordinates.length - 1) {
        graphics.drawLine(coordinates[i][0], coordinates[i][1], coordinates[0][0], coordinates[0][1]);
      } else {
        graphics.drawLine(coordinates[i][0], coordinates[i][1], coordinates[i + 1][0], coordinates[i + 1][1]);
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
