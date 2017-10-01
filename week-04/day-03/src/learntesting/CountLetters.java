package learntesting;

import java.util.HashMap;

public class CountLetters {
  String inputString;

  public CountLetters(String inputString) {
    this.inputString = inputString;
  }

  public HashMap buildDictionary() {
    HashMap<String, Integer> dictionary = new HashMap<>();

    for (int i = 0; i < inputString.length(); i++) {
      Integer temp = dictionary.get(inputString.substring(i, i + 1));
      if ( temp != null) {
        dictionary.put(inputString.substring(i, i + 1), dictionary.get(inputString.substring(i, i + 1)) + 1);
      }
      dictionary.put(inputString.substring(i, i + 1), 1);
    }
    return dictionary;
  }
}

//  Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
//  Create a test for that.