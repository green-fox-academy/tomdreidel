import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Give me the size of the square and I will draw a diagonal to it:");
        int size = numberScanner.nextInt();

        if (size < 1) {
            System.out.println("Not big enough");
        } else if (size == 1) {
            System.out.println("%%%%%");
        } else if (size == 2) {
            System.out.println("%%%%%");
            System.out.println("%%%%%");
        } else if (size == 3) {
            System.out.println("%%%%%");
            System.out.println("% % %");
            System.out.println("%%%%%");
        } else {
            System.out.println("%%%%%");
            for (int i = 0; i < (size - 2); i++) {
                System.out.println("%   %");
            }
            System.out.println("%%%%%");
        }
    }
}