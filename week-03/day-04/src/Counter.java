public class Counter {

  public static void main(String[] args) {
    int number = 20;
    System.out.println(countdown(number));
  }

  private static String countdown(int number) {
    String result = " " + number;
    if (number == 1) {
      result = " 1";
      return result;
    }
    result = result + countdown(number - 1);
    return result;
  }
}

// Write a recursive function that takes one parameter: n and counts down from n.