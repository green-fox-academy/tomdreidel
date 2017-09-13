import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        Scanner calcScanner = new Scanner(System.in);
        System.out.println("Please type in the expression:\n(example: \"* 15 2\")");
        String calcInput = calcScanner.nextLine();

        String operator = calcInput.substring(0, 1);
        int number1 = Integer.parseInt(calcInput.substring(calcInput.indexOf(" ") + 1, calcInput.lastIndexOf(" ")));
        int number2 = Integer.parseInt(calcInput.substring(calcInput.lastIndexOf(" ") + 1));

        if (operator.equals("+")) {
            System.out.println((float) number1 + number2);
        }
        else if (operator.equals("-")) {
            System.out.println((float) number1 - number2);
        }
        else if (operator.equals("*")) {
            System.out.println((float) number1 * number2);
        }
        else if (operator.equals("/")) {
            System.out.println((float) number1 / number2);
        }
        else if (operator.equals("%")) {
            System.out.println((float) number1 % number2);
        }
        else {
            System.out.println("Your operator is invalid");
        }
    }
}