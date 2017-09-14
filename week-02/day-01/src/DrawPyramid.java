import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Give me the size of the pyramid:");
        int number = numberScanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < (number - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}