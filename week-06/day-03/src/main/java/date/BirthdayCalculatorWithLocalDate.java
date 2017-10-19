package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayCalculatorWithLocalDate implements date.BirthdayCalculator<LocalDate> {

  @Override
  public LocalDate parseDate(String str) {
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate result = LocalDate.parse(str);
    return LocalDate.parse(result.format(format));
    // TODO - return with the parsed date; format is: yyyy-MM-dd
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
    DateTimeFormatter format = DateTimeFormatter.ofPattern("MM. dd.");
    String dateFormatted = date.format(format);
    return dateFormatted;
    // TODO - return the date formatted: month & day (MM. dd.)
  }

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
    if (printMonthAndDay(date) == printMonthAndDay(LocalDate.now())) {
      return true;
    }
    return false;
    // TODO - return with true if today is the same month+day as date
  }

  @Override
  public int calculateAgeInYears(LocalDate birthday) {
    return LocalDate.now().getYear() - birthday.getYear();
    // TODO - return how many years ago the input date 'birthday' was
  }

  @Override
  public int calculateDaysToNextAnniversary(LocalDate date) {
    if (LocalDate.now().getDayOfYear() <= date.getDayOfYear()) {
      return date.getDayOfYear() - LocalDate.now().getDayOfYear();
    }
    return java.time.Year.of(LocalDate.now().getYear()).length() - LocalDate.now().getDayOfYear() + date.getDayOfYear();
    // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
  }

  public static void main(String[] args) {
    new BirthdayCalculatorWithLocalDate().run();
  }

  private void run() {

    print("Birthday with java.util.Date.");
    String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

    LocalDate birthdayDate = parseDate(birthdayStr);
    print("Your birthday: " + printMonthAndDay(birthdayDate));

    if (isAnniversaryToday(birthdayDate)) {
      int ageInYears = calculateAgeInYears(birthdayDate);
      print("Congratulations! Today is your " + ageInYears + "th birthday!");
    } else {
      int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
      print("You have to wait only " + daysLeft + " days for your next birthday.");
    }
  }

  private void print(String line) {
    System.out.println(line);
  }

  private String readInput(String message) {
    System.out.print(message + ": ");
    return input.nextLine();
  }

  private final Scanner input = new Scanner(System.in, "UTF-8");
}