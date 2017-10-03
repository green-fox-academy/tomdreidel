package wanderer;

import javax.swing.JFrame;

public class Main {

  public static void main(String[] args) {
    JFrame frame = new JFrame("The Wanderer");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }
}