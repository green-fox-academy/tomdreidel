import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Give me the size of the diamond:");

        float number = numberScanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i < (Math.ceil(number / 2)) + 1) {
                for (int j = 0; j < (number - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
            }
            else {
                for (int l = 1; l <= (i - 1); l++) {
                    System.out.print(" ");
                }
                for (int m = 1; m < ((number - i + 1) * 2); m++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}