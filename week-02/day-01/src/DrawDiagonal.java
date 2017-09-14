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
        System.out.println("Give me the size of the square with a diagonal in it:");
        int size = numberScanner.nextInt();

        if (size < 1) {
            System.out.println("Not big enough to draw");
        }
        else if (size == 1) {
            System.out.println("%%%%%");
        }
        else if (size == 2) {
            System.out.println("%%%%%");
            System.out.println("%%%%%");
        }
        else {
            System.out.println("%%%%%");
            for (int i = 0; i < (size - 2); i++) {
                if (i == 0 && i == (size - 3)) {
                    System.out.println("% % %");
                }
                else if (i == 0) {
                    System.out.println("%%  %");
                }
                else if (i == (size - 3)) {
                    System.out.println("%  %%");
                }
                else {
                    System.out.println("% % %");
                }
            }
            System.out.println("%%%%%");
        }
    }
}