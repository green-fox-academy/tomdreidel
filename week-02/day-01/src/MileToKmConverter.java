import java.text.DecimalFormat;
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("Give me the distance in km's");

        Scanner kmMile = new Scanner(System.in);
        double distKm = kmMile.nextDouble();
        double distMile = distKm / 1.609344;
        String distMileFormatted = new DecimalFormat("####.#").format(distMile);

        System.out.println("This is not less than " + distMileFormatted + " miles.");
    }
}
