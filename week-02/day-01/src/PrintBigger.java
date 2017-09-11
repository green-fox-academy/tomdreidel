import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Give me a number:");
        int firstNumber = numberScanner.nextInt();
        System.out.println("Give me another number:");
        int secondNumber = numberScanner.nextInt();

        if(firstNumber > secondNumber) {
            System.out.println(firstNumber + " is the bigger one.");
        }
        else if (firstNumber < secondNumber) {
            System.out.println(secondNumber + " is the bigger one.");
        }
        else {
            System.out.println("The numbers are the same");
        }
    }
}