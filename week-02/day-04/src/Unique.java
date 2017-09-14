import java.util.ArrayList;
import java.util.Scanner;

public class Unique {

  public static void main(String[] args) {
    //    Create a function that takes a list of numbers as a parameter
    //    Returns a list of numbers where every number in the list occurs only once

    ArrayList<Integer> numberList = new ArrayList<>();
    Scanner numberScanner = new Scanner(System.in);

    while (true) {
      System.out.println("Enter a number:\n(or press Enter to start process)");
      String numberTemp = numberScanner.nextLine();

      if (numberTemp.equals("")) {
        System.out.println("Your numbers:");
        System.out.println(numberList);
        System.out.println("\nUnique values:");
        System.out.println(uniqer(numberList));
        break;
      }
      else {
        numberList.add(Integer.parseInt(numberTemp));
      }
    }
  }

  private static ArrayList uniqer(ArrayList inputList) {
    for (int i = 0; i < inputList.size(); i++) {
      for (int j = 0; j < inputList.size(); j++) {
        if (i != j && inputList.get(i) == inputList.get(j)) {
          inputList.remove(i);
        }
      }
    }
    return inputList;
  }
}