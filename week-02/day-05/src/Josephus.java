import java.util.ArrayList;
import java.util.Scanner;

public class Josephus {

  public static void main(String[] args) {
    //  Write a function to solve Josephus Problem.
    //  The program should ask for a number, this number represents how many people are in the "game".
    //  The return value should be the number of the "winning" seat.

    Scanner seatScanner = new Scanner(System.in);
    System.out.println("For how many rebels do you want to optimize your seat?");
    int seat = seatScanner.nextInt();

    System.out.println(josephusSolver(seat));
  }

  private static String josephusSolver(int seat) {
    ArrayList<Integer> deadCircle = new ArrayList<>();
    for (int i = 0; i < seat; i++) {
      deadCircle.add(i + 2);
    }

    while (deadCircle.size() > 1) {
      ArrayList<Integer> peopleToDelete = new ArrayList<>();

      if (deadCircle.size() % 2 ==0) {
        for (int j = 0; j < deadCircle.size(); j += 2) {
          peopleToDelete.add(deadCircle.get(j));
        }
      }
      else {
        for (int j = 2; j < deadCircle.size(); j += 2) {
          peopleToDelete.add(deadCircle.get(j));
        }
      }

      for (int k = 0; k < peopleToDelete.size(); k++) {
          int innerTemp = peopleToDelete.get(k);
          int innerDeleteIndex = deadCircle.indexOf(innerTemp);
          deadCircle.remove(innerDeleteIndex);
        }
    }
    return "" + deadCircle;
  }
}