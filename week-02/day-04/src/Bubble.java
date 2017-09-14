import java.util.ArrayList;
import java.util.Scanner;

public class Bubble {

  public static void main(String[] args) {
    //    Create a function that takes a list of numbers as parameter
    //    Returns a list where the elements are sorted in ascending numerical order
    //    Make a second boolean parameter, if it's true sort that list descending

    ArrayList<Integer> numberList = new ArrayList<>();
    Scanner numberScanner = new Scanner(System.in);
    boolean descending = true;

    while (true) {
      System.out.println("Enter a number:\n(or press Enter to start sorting)");
      String numberTemp = numberScanner.nextLine();

      if (numberTemp.equals("")) {
        System.out.println("Enter \"D\"for descending list or Enter to continue");

        if (numberScanner.nextLine().equals("")) {
          descending = false;
        }

        System.out.println("Your numbers:");
        System.out.println(numberList);
        System.out.println("\nAnd in " + (descending ? "descending" : "ascending") + " order:");
        System.out.println(sortingMachine(numberList, descending));
        break;
      }
      else {
        numberList.add(Integer.parseInt(numberTemp));
      }
    }
  }

  private static ArrayList sortingMachine (ArrayList arrayInput, Boolean descend) {
    boolean didItSwap = true;
    while (didItSwap) {
      boolean innerBool = false;
      for (int i = 0; i < arrayInput.size() - 1; i++) {
        if (descend) {
          if ((int) arrayInput.get(i) < (int) arrayInput.get(i + 1)) {
            int swapper = (int) arrayInput.get(i);
            arrayInput.set(i, arrayInput.get(i + 1));
            arrayInput.set((i + 1), swapper);
            innerBool = true;
          }
          didItSwap = innerBool;
        }
        else {
          if ((int) arrayInput.get(i) > (int) arrayInput.get(i + 1)) {
            int swapper = (int) arrayInput.get(i);
            arrayInput.set(i, arrayInput.get(i + 1));
            arrayInput.set((i + 1), swapper);
            innerBool = true;
          }
          didItSwap = innerBool;
        }
      }
    }
    return arrayInput;
  }
}