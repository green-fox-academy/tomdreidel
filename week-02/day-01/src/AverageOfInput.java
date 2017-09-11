import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Give me the first number:");
        int a = numberScanner.nextInt();
        System.out.println("Give me the second number:");
        int b = numberScanner.nextInt();
        System.out.println("Give me the third number:");
        int c = numberScanner.nextInt();
        System.out.println("Give me the fourth number:");
        int d = numberScanner.nextInt();
        System.out.println("Give me the fifth number:");
        int e = numberScanner.nextInt();

        float averageNum = (a + b + c + d + e) / 5;

        System.out.println("The average of your numbers is: " + averageNum);
    }
}