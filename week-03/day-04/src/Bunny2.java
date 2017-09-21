public class Bunny2 {

  public static void main(String[] args) {

    int bunnyCount = 5;
    System.out.println(earCursion(bunnyCount));
  }

  private static int earCursion(int bunnyCount) {
    int earCounter = 0;

    if (bunnyCount < 1) {
      return earCounter;
    }
    if (bunnyCount % 2 == 0) {
      earCounter += 3 + earCursion(bunnyCount - 1);
      return earCounter;
    }
    earCounter += 2 + earCursion(bunnyCount - 1);
    return earCounter;
  }
}

// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).