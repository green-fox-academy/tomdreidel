package learntesting;

import java.util.Arrays;

public class Anagram {
  String firstWord;
  String secondWord;

  public Anagram(String firstWord, String secondWord) {
    this.firstWord = firstWord;
    this.secondWord = secondWord;
  }

  public boolean anagramFinder() {
    char[] firstTemp = firstWord.toCharArray();
    char[] secondTemp = secondWord.toCharArray();
    Arrays.sort(firstTemp);
    Arrays.sort(secondTemp);

    return Arrays.equals(firstTemp, secondTemp);
    }
  }

//  Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagrams or not.
//  Create a test for that.