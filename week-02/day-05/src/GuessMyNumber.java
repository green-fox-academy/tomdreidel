import java.util.Scanner;

public class GuessMyNumber {

  public static void main(String[] args) {
    //  Write a program where the program chooses a number between 1 and 100.
    //  The player is then asked to enter a guess. If the player guesses wrong,
    //  then the program gives feedback and ask to enter an other guess until the guess is correct.
    //
    //  Make the range customizable (ask for it before starting the guessing).
    //  You can add lives. (optional)

    int number = ((int) (Math.random() * 100 -1) + 1);

    Scanner guessScanner = new Scanner(System.in);
    System.out.println("Guess my number! You have 5 tries.");
    System.out.println("Take a guess:");
    int guess = guessScanner.nextInt();

    while (guess != number) {
      for (int i = 0; i < 4; i++) {
        if (guess == number) {
          System.out.println("Congrats! You won!");
          break;
        }
        else if (guess < number) {
          System.out.println("Too small. Guess again:");
          System.out.println("You have " + (4 - i) + " " + ((i == 3) ? "try" : "tries") + " left");
          guess = guessScanner.nextInt();
        }
        else {
          System.out.println("Too big. Guess again:");
          System.out.println("You have " + (4 - i) + " " + ((i == 3) ? "try" : "tries") + " left");
          guess = guessScanner.nextInt();
        }
      }
      System.out.println("You lost!");
      System.out.println("It was: " + number);
      break;
    }
  }
}