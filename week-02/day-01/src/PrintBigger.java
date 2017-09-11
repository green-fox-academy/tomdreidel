import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the first number:");
        int a = scanner.nextInt();
        System.out.println("Give me the second number:");
        int b = scanner.nextInt();

        if(a > b) {
            System.out.println(a + " is the bigger one.");
        }
        else if (a < b) {
            System.out.println(b + " is the bigger one.");
        }
        else {
            System.out.println("It's a tie");
        }

    }
}
