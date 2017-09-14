import java.util.Scanner;

public class GuessTheNumber {

  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stored number is lower
    // You found the number: 8

    int storedNumber;
    int yourGuess;

    Scanner guessScanner = new Scanner(System.in);
    System.out.println("Enter a number to guess:");
    storedNumber = guessScanner.nextInt();

    for (int i = 0; i < 40; i++) {
      System.out.println();
    }

    System.out.println("Please take a guess:");
    yourGuess = guessScanner.nextInt();

    while (yourGuess != storedNumber) {
      if (yourGuess < storedNumber) {
        System.out.println("The stored number is higher");
        System.out.println("Please take another guess:");
        yourGuess = guessScanner.nextInt();
      }
      else {
        System.out.println("The stored number is lower");
        System.out.println("Please take another guess:");
        yourGuess = guessScanner.nextInt();
      }
    }
    System.out.println("You found the number: 8");
  }
}