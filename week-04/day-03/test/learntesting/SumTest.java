package learntesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

  Sum testSum = new Sum();

  @Test
  public void add() throws Exception {
    assertTrue(testSum.numbers.size() == 0);
  }

  @Test
  public void add2() throws Exception {
    testSum.add(4);
    assertTrue(testSum.numbers.size() == 1);
  }

  @Test
  public void sumMethod() throws Exception {
    testSum.add(4);
    testSum.add(2);
    testSum.add(3);
    testSum.add(1);
    assertEquals(10, testSum.sumMethod());
  }

  @Test
  public void sumMethod2() throws Exception {
    assertEquals(0, testSum.sumMethod());
  }

  @Test
  public void sumMethod3() throws Exception {
    testSum.add(9);
    assertEquals(9, testSum.sumMethod());
  }

  @Test
  public void sumMethod4() throws Exception {
    testSum.numbers.add(null);
    assertEquals(0, testSum.sumMethod());
  }

  @Test
  public void sumMethod5() throws Exception {
    testSum.numbers.add(null);
    testSum.add(4);
    testSum.add(3);
    assertEquals(7, testSum.sumMethod());
  }
}