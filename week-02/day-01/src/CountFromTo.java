import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Give me the first number:");
        int a = numberScanner.nextInt();

        System.out.println("Give me the second number:");
        int b = numberScanner.nextInt();

        if (a < b) {
            for (int i = a; i < b; i++) {
                System.out.println(i);
            }
        }
        else {
                System.out.println("The second number should be bigger");
            }
        }
}