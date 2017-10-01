package learntesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  Anagram test = new Anagram("what", "what");
  Anagram test2 = new Anagram("what", "whatnot");

  @Test
  public void anagramFinder() throws Exception {
    assertTrue(test.anagramFinder());
  }

  @Test
  public void anagramFinder2() throws Exception {
    assertFalse(test2.anagramFinder());
  }
}