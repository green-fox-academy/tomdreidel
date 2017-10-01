package learntesting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {

  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a <= b && a <= c) {
      if (b <= c) {
        return c;
      }
    return b;
    }
    if (b <= c) {
      return c;
    }
    if (a < b) {
      return b;
    }
   return a;
  }

  double median(List<Integer> pool) {
      Collections.sort(pool);
    if (pool.size() % 2 == 0) {
      int a = pool.get(pool.size() / 2);
      int b = pool.get(pool.size() / 2 - 1);
      return (double) (a + b) / 2;
    }
    return (double) pool.get(pool.size() / 2);
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'e', 'i', 'o', 'u').contains(Character.toLowerCase(c));
  }

  String translate(String hungarian) {
    return hungarian.replaceAll("/[aeouiAEOUI]/g", "$&v$&");
    }
  }

//  Check out the java folder. There's a work file and a test file.
//
//  Run the tests, all 10 should be green (passing).
//  The implementations though are not quite good.
//  Create tests that'll fail, and will show how the implementations are wrong
//  After creating the tests, fix the implementations
//  Check again, if you can create failing tests
//  Implement if needed