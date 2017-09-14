import java.util.ArrayList;
import java.util.Arrays;

public class SubstrList {

  public static void main(String[] args) {
    //    Create a function that takes a string and a list of string as a parameter
    //    Returns the index of the string in the list where the first string is part of
    //    Returns -1 if the string is not part any of the strings in the list

    ArrayList<String> baconList = new ArrayList<>(Arrays.asList("short ribs", "picanha", "burgdoggen", "pig ground", "round porchetta",  "pork loin"));
    String meat = "porch";

    System.out.println(meatGrinder(meat, baconList));
  }

  private static int meatGrinder(String meat, ArrayList<String> baconList) {
    for (int i = 0; i < baconList.size(); i++) {
      if (baconList.get(i).contains(meat)) {
        return i;
      }
    }
    return -1;
  }
}