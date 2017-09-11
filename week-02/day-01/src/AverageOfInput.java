import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the first number:");
        int a = scanner.nextInt();
        System.out.println("Give me the second number:");
        int b = scanner.nextInt();
        System.out.println("Give me the third number:");
        int c = scanner.nextInt();
        System.out.println("Give me the fourth number:");
        int d = scanner.nextInt();
        System.out.println("Give me the fifth number:");
        int e = scanner.nextInt();

        float averageNum = (a + b + c + d + e) / 5;

        System.out.println("The average of your numbers is: " + averageNum);
    }
}
