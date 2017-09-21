public class String1 {

  public static void main(String[] args) {

    String text = "xoga is xesokax for xou!";
    System.out.println(wyeMachine(text));
  }

  private static String wyeMachine(String text) {
    String result = "";
    if (text.length() == 0) {
      return result;
    }
    else if (text.substring(0, 1).equals("x")) {
      return "y" + wyeMachine(text.substring(1));
    }
    return text.substring(0, 1) + wyeMachine(text.substring(1));
  }
}

// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.