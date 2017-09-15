public class Anagram {

  public static void main(String[] args) {
    //Create a function named is anagram following your current language's style guide.
    //It should take two strings and return a boolean value depending on whether its an anagram or not.

    String firstWord = "god";
    String secondWord = "dog";

    System.out.println(isAnagram(firstWord, secondWord));
  }

  private static boolean isAnagram(String firstWord, String secondWord) {
    if (firstWord.length() != secondWord.length()) {
      return false;
    }
    else {
      for (int i = 0; i < firstWord.length(); i++) {
        if (firstWord.charAt(i) != secondWord.charAt((secondWord.length() - 1) - i)) {
          return false;
        }
      }
      return true;
    }
  }
}