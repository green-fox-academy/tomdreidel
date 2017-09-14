import java.util.ArrayList;

public class Subint {

  public static void main(String[] args) {
    //    Create a function that takes a number and a list of numbers as a parameter
    //    Returns the indeces of the numbers in the list where the first number is part of
    //    Returns an empty list if the number is not part any of the numbers in the list

    int[] numberList = {2, 4, 42, 67, 88, 102, 55, 0};
    int searchKey = 2;

    System.out.println("Index of numbers that contain: " + searchKey);
    System.out.println(integerHunter(searchKey, numberList));
  }

  public static ArrayList integerHunter(int key, int[] list) {
    ArrayList<Integer> Result = new ArrayList<>();
    for (int i = 0; i < list.length; i++) {
      String keyTemp = Integer.toString(key);
      String temp = Integer.toString(list[i]);
      if (temp.contains(keyTemp)) {
        Result.add(i);
      }
    }
    return Result;
  }
}