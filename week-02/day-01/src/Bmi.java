import java.text.DecimalFormat;

public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values

        float bmi = (float) (massInKg / Math.pow(heightInM, 2));
        String bmiFormatted = new DecimalFormat("##.#").format(bmi);

        System.out.println("Your BMI is: " + bmiFormatted);
    }
}