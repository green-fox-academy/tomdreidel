public class Palindrome {

  public static void main(String[] args) {
    //Create a function named create palindrome following your current language's style guide.
    //It should take a string, create a palindrome from it and then return it.

    String inputWord = "gollam";

    System.out.println(createPalindrome(inputWord));
  }

  private static String createPalindrome(String inputWord) {
    String temp = inputWord;
    for (int i = 0; i < inputWord.length(); i++) {
      temp += inputWord.charAt((inputWord.length() - 1) - i);
    }
    return temp;
  }
}