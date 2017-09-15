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


    return "" + seat;
  }

}