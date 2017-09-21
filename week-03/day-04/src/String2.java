public class String2 {

  public static void main(String[] args) {

    String text = "Whxat ixs xwroxng wxith mxy kexyboxarxd?";
    System.out.println(deXer(text));
  }

  private static String deXer(String text) {
    String result = "";
    if (text.length() == 0) {
      return result;
    }
    else if (text.substring(0, 1).equals("x")) {
      return deXer(text.substring(1));
    }
    return text.substring(0, 1) + deXer(text.substring(1));
  }
}

// Given a string, compute recursively a new string where all the 'x' chars have been removed.