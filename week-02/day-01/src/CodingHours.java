import java.text.DecimalFormat;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int dailyCode = 6;
        int semesterLength = 17;
        int workDays = 5;
        int semesterCode = semesterLength * workDays * dailyCode;
        int workHours = 52;
        float percentageCode = (((float) (dailyCode * workDays)) / workHours);
        String percentageFormat = new DecimalFormat("##.#%").format(percentageCode);

        System.out.println("Hours of coding by average attendee in a semester: " + semesterCode);
        System.out.println("Percentage of coding hours: " + percentageFormat);
    }
}