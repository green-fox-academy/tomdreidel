import java.util.ArrayList;

public class PalindromeSearch {

  public static void main(String[] args) {
    //Create a function named search palindrome following your current language's style guide.
    //It should take a string, search for palindromes that at least 3 characters long
    //and return a list with the found palindromes.

    String textInput = "dog goat dad duck doodle never";

    System.out.println(searchPalindrome(textInput));
  }

  private static ArrayList searchPalindrome(String textInput) {
    ArrayList<String> resultArray = new ArrayList<>();
    for (int i = 3; i < textInput.length(); i++) {
      for (int j = 0; j < (textInput.length() - i); j++) {
        String tempSubstring = textInput.substring(j, (j + i));
        int counter = tempSubstring.length();
        for (int k = 0; k < tempSubstring.length(); k++) {
          if (tempSubstring.charAt(k) == tempSubstring.charAt((tempSubstring.length() - 1) - k)) {
            counter -= 1;
          }
        }
        if (counter == 0) {
          resultArray.add("\"" + tempSubstring + "\"");
        }
      }
    }
    return resultArray;
  }
}