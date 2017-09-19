import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    // create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // it should print "fail" if the parameter is 0

    Scanner numberScanner = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int inputNumber = numberScanner.nextInt();

    try {
      System.out.println(10 / inputNumber);
    } catch (Exception e) {
      System.out.println("fail");
    }
  }
}