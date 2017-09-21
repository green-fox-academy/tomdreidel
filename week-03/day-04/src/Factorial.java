public class Factorial {

  public static void main(String[] args) {

    int number = 6;

    System.out.println(factorial(number));
    System.out.println(factorio(number));
  }

  private static int factorio(int number) {
    if (number == 1) {
      return 1;
    }
    return number * factorio(number - 1);
  }

  private static int factorial(int number) {
    int result = 1;
    for (int i = 1; i <= number ; i++) {
      result *= i;
    }
    return result;
  }
}