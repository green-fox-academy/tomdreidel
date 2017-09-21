public class Bunny1 {

  public static void main(String[] args) {

    int bunnyCount = 5;
    System.out.println(earCursion(bunnyCount));
  }

  private static int earCursion(int bunnyCount) {
    int earCounter = 0;
    if (bunnyCount < 1) {
      return earCounter;
    }
    earCounter += 2 + earCursion(bunnyCount - 1);
    return earCounter;
  }
}

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).