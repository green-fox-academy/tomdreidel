public class Fibonacci {

  public static void main(String[] args) {

    int number = 8;
    System.out.println(fiboMachine(number));
  }

  private static int fiboMachine(int number) {
    int fibonacci = 0;
    if (number < 0) {
      return 0;
    }
    else if (number == 0) {
      return fibonacci;
    }
    else if (number == 1) {
      return fibonacci + 1;
    }
    fibonacci += fiboMachine(number - 2) + fiboMachine(number - 1);
    return fibonacci;
  }
}

// The fibonacci sequence is a famous bit of mathematics, and it happens to
// have a recursive definition. The first two values in the sequence are
// 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
// and so on. Define a recursive fibonacci(n) method that returns the nth
// fibonacci number, with n=0 representing the start of the sequence.