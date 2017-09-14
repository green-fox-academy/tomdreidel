public class Substr {

  public static void main(String[] args) {
    //    Create a function that takes two strings as a parameter
    //    Returns the starting index where the second one is starting in the first one
    //    Returns -1 if the second string is not in the first one

    String textBase = "Cut the cheese melted cheese gouda. Babybel gouda dolcelatte melted cheese boursin airedale.";
    String searchKey = "gouda";

    System.out.println(textChecker(textBase, searchKey));
  }

  static Integer textChecker(String text, String key) {
    if (!(text.contains(key))) {
      return -1;
    }
    else {
      return text.indexOf(key);
    }
  }
}