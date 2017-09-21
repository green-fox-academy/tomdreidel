public class SumDigit {

  public static void main(String[] args) {

    int number = 54321;
    System.out.println(sumDigit(number));
  }

  private static int sumDigit(int number) {
    int sum = number % 10;
    if (number < 0) {
      return 0;
    } else if (number / 10 == 0) {
      sum = number;
      return sum;
    }
    sum += sumDigit(number / 10);
    return sum;
  }
}

// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while 
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).