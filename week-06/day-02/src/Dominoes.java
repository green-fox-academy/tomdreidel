import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(dominoes);

    ArrayList<Domino> solution = new ArrayList<>();
    solution.add(dominoes.get(0));

    for (int i = 0; i < dominoes.size() - 1; i++) {
      for (int j = 1; j < dominoes.size(); j++) {
        if ((dominoes.get(j).getValues())[0] == solution.get(solution.size() - 1).getValues()[1]) {
          solution.add(dominoes.get(j));
        }
      }
    }

    System.out.println(solution);

    System.out.println(dominoes.get(1).compareTo(dominoes.get(1)));

    Arrays.sort(dominoes, dominoes, Arrays.DE);

    System.out.println(dominoes);



  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}

class Domino implements Comparable<Domino> {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  @Override
  public int compareTo(Domino o) {
    return 0;
  }
}