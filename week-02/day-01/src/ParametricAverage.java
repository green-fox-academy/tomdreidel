import java.util.Scanner;

public class ParametricAverage {

  public static void main(String[] args) {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    Scanner numberInput = new Scanner(System.in);
    System.out.println("How many numbers you want to analyze?");
    int numberCount = numberInput.nextInt();
    int numberSum = 0;

    if (numberCount < 1) {
      System.out.println("This group size cannot be analyzed");
    }
    else {
      int[] numberStore = new int[numberCount];

      for (int i = 0; i < numberCount; i++) {
        System.out.println("Enter number #" + (i + 1) + ":");
        numberStore[i] = numberInput.nextInt();
      }

      for (int j = 0; j < numberStore.length; j++) {
        numberSum += numberStore[j];
      }

      System.out.print("Sum: " + numberSum);
      System.out.print(" | ");
      System.out.print("Average: " + (numberSum / (float) numberCount));
    }
  }
}