import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MainTest {

  Deck testDeck = new Deck();

  @Before
  public void setUp() throws Exception {
    testDeck.generate();
  }

  @Test
  public void main() throws Exception {
    assertEquals(52, testDeck.size());

  }
  @Test
  public void main2() throws Exception {
    Hand testHand = testDeck.pull();
    assertEquals(47, testDeck.size());
    assertEquals(5, testHand.size());

  }  @Test
  public void main3() throws Exception {
    Hand testHand = testDeck.pull();
    Hand testHand2 = testDeck.pull();
    assertEquals(42, testDeck.size());
    assertEquals(5, testHand.size());
    assertEquals(5, testHand2.size());

  }

}