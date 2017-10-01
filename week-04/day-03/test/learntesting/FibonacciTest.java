package learntesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

  Fibonacci testFib = new Fibonacci();

  @Test
  public void fiboMachine() throws Exception {
    assertEquals(21, testFib.fiboMachine(8));
  }

  @Test
  public void fiboMachine2() throws Exception {
    assertEquals(0, testFib.fiboMachine(0));
  }

  @Test
  public void fiboMachine3() throws Exception {
    assertEquals(1, testFib.fiboMachine(1));
  }

  @Test
  public void fiboMachine4() throws Exception {
    assertEquals(1, testFib.fiboMachine(2));
  }

  @Test
  public void fiboMachine5() throws Exception {
    assertEquals(-1, testFib.fiboMachine(-2));
  }
}