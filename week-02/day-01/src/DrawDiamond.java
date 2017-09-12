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

        int number = numberScanner.nextInt();

        for (int i = 0; i < number; i++) {

            if (i <= (number / 2)) {

                for (int j = 1; j < (number / 2 - i); j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < (i * 2 - 1); k++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            else {
                for (int l = 0; l < (i - number / 2); l++) {
                    System.out.print(" ");
                }

                for (int m = (number - i) * 2 - 1; m > 0; m--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}