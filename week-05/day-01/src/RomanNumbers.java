public class RomanNumbers {

  public static void main(String[] args) {
    int arabic = 6;
    System.out.println(convertToRoman(arabic));
  }

  private static String convertToRoman(int arabic) {
    String result = "";

    if (arabic < 10) {
      if (arabic % 5 == 0) {
        arabic = arabic / 5;
        for (int i = 0; i < arabic; i++) {
          result += "I";
        }

      }
    }

    return result;
  }
}