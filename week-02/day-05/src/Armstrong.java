import java.util.Scanner;

public class Armstrong {

  public static void main(String[] args) {
    //  Write a simple program to check if a given number is an armstrong number.
    //  The program should ask for a number. E.g. if we type 371, the program should
    //  print out: The 371 is an Armstrong number.

    Scanner numberInput = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int armCheck = numberInput.nextInt();

    System.out.println(isArmstrong(armCheck));
  }

  private static String isArmstrong(int armCheck) {
    int innerTemp = 0;
    String innerNumber = Integer.toString(armCheck);
    int innerPower = innerNumber.length();

    for (int i = 0; i < (innerNumber.length()); i++) {
      int innerChar = Integer.parseInt(innerNumber.substring(i, i + 1));
      innerTemp += (int) (Math.pow(innerChar, innerPower));
    }
    if (innerTemp == armCheck) {
      return "The " + armCheck + " is an Armstrong number.";
    }
    else {
      return "The " + armCheck + " is NOT an Armstrong number";
    }
  }
}