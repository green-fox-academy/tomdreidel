package learntesting;

import static org.junit.Assert.*;

import learntesting.Apple;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppleTest {

  Apple testApple = new Apple();

  @Before
  public void setUp() throws Exception {
    System.out.println("testing started...");
  }

  @After
  public void tearDown() throws Exception {
    System.out.println("testing finished");
  }

  @Test
  public void getApple() throws Exception {
    assertEquals("apple", testApple.getApple());
  }
}