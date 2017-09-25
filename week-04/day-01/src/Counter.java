import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Counter {
  //  Create Counter class
  //  which has an integer field value
  //  when creating it should have a default value 0 or we can specify it when creating
  //  we can add(number) to this counter another whole number
  //  or we can add() without parameters just increasing the counter's value by one
  //  and we can get() the current value
  //  also we can reset() the value to the initial value
  //  Check if everything is working fine with the proper test
  //  Download CounterTest.java and place it next to your solution
  //  If something's red in it, ALT+Enter Add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
  //  Then run the tests with the green play button before the lines (run all of them before the classname)

  int field;
  int orig;

  public Counter() {
    orig = 0;
    field = 0;
  }

  public Counter(int number) {
    this.field = number;
    this.orig = number;
  }

  void add() {
    field ++;
  }

  void add(int number) {
    field += number;
  }

  public int get() {
    return field;
  }

  void reset() {
    field = orig;
  }

  public static void main(String[] args) {

    Counter myCounter = new Counter();
    System.out.println(myCounter.get());
    myCounter.add();
    System.out.println(myCounter.get());
    myCounter.add(17);
    System.out.println(myCounter.get());
    myCounter.reset();
    System.out.println(myCounter.get());

    Counter anotherCounter = new Counter(45);
    System.out.println(anotherCounter.get());
    anotherCounter.add(20);
    System.out.println(anotherCounter.get());
    anotherCounter.reset();
    System.out.println(anotherCounter.get());
  }
}

/**
 * Created by aze on 2017.03.29..
 */

class CounterTest {

  Counter c = new Counter();

  @Test
  void addMore() {
    c.add(5);
    assertEquals(5, c.get());
  }

  @Test
  void addOne() {
    c.add();
    assertEquals(1, c.get());
  }

  @Test
  void getZero() {
    assertEquals(0, c.get());
  }

  @Test
  void getInit() {
    Counter c = new Counter(7);
    assertEquals(7, c.get());
  }

  @Test
  void resetToZero() {
    c.add();
    c.reset();
    assertEquals(0, c.get());
  }

  @Test
  void resetToInit() {
    Counter c = new Counter(7);
    c.add(5);
    c.reset();
    assertEquals(7, c.get());
  }
}