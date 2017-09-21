public class NumberAdder {

  public static void main(String[] args) {

    int number = 1000;
    System.out.println(addNumbers(number));
  }

  private static int addNumbers(int number) {
    if (number == 1) {
      return 1;
    }
    return number + (number - 1);
  }
}

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.