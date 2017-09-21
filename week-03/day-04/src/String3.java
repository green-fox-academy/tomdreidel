public class String3 {

  public static void main(String[] args) {

    String text = "given a string";
    System.out.println(stringSeparator(text));
  }

  private static String stringSeparator(String text) {
    String result = "";
    if (text.length() == 0) {
      return result;
    }
    return text.substring(0, 1) + "*" + stringSeparator(text.substring(1));
  }
}

// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".