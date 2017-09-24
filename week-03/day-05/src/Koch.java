import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Koch {

  public static void mainDraw(Graphics graphics) {

    int lineLength = 600;
    int posX = (WIDTH - lineLength) / 2;
    int posY = HEIGHT / 2;
    int iteration = 0;

    graphics.setColor(new Color(255, 199, 38));
    graphics.fillRect(0, 0, WIDTH, HEIGHT);

    kochBroccoli(graphics, posX, posY, lineLength, iteration);
  }

  private static void kochBroccoli(Graphics graphics, int posX, int posY, int lineLength, int iteration) {

    if (iteration == 4) {
      return;
    }

    int[] pointsX = new int[5];
    int[] pointsY = new int[5];

    pointsX[0] = posX;
    pointsX[1] = posX + lineLength / 3;
    pointsX[2] = posX + lineLength / 2;
    pointsX[3] = posX + lineLength * 2 / 3;
    pointsX[4] = posX + lineLength;

    pointsY[0] = posY;
    pointsY[1] = posY;
    pointsY[2] = posY + ((int) (posY - lineLength / 6 * Math.sqrt(3)));
    pointsY[3] = posY;
    pointsY[4] = posY;


    graphics.setColor(new Color(120, 157, 38));

    graphics.drawPolyline(pointsX, pointsY, pointsX.length - 1);

//    graphics.drawLine(pointsX[], pointsY, pointsX[], pointsY[]);



//    graphics.drawLine(posX, posY, posX + lineLength / 3, posY);
//    graphics.drawLine(posX + lineLength / 3, posY, posX + lineLength / 2, ((int)(posY - lineLength / 6 * Math.sqrt(3))));
//    graphics.drawLine(posX + lineLength / 2, ((int)(posY - lineLength / 6 * Math.sqrt(3))), posX + lineLength * 2 / 3, posY);
//    graphics.drawLine(posX, posY, posX + lineLength * 2 / 3, posY);


    kochBroccoli(graphics, pointsX[iteration], pointsY[iteration], lineLength / 3, iteration + 1);
//    kochBroccoli(graphics, posX + lineLength / 3, posY, lineLength / 3, iteration - 1);
//    kochBroccoli(graphics, posX + lineLength / 2, (int)(posY - lineLength / 6 * Math.sqrt(3)), lineLength / 3, iteration - 1);
//    kochBroccoli(graphics, posX + lineLength * 2 / 3, posY, lineLength / 3, iteration - 1);






  }

  //    Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("What You Draw Is What You Become... Recursively");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}