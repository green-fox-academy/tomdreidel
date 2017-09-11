import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // Than prints "Odd" if the number is odd, or "Even" it it is even.

        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Give me a number to analyze:");

        int number = numberScanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("It is even");
        } else {
            System.out.println("It is odd");
        }
    }
}