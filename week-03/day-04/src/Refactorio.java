public class Refactorio {

  public static void main(String[] args) {

    int number = 6;
    System.out.println(factorio(number));
  }

  private static int factorio(int number) {
    if (number == 1) {
      return 1;
    }
    return number * factorio(number - 1);
  }
}

// - Create a recursive function called `refactorio`
//   that returns it's input's factorial