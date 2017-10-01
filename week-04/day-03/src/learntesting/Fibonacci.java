package learntesting;

public class Fibonacci {
  int number;

  public Fibonacci() {

  }

  public int fiboMachine(int number) {
    int fibonacci = 0;
    if (number < 0) {
      return -1;
    }
    else if (number == 0) {
      return fibonacci;
    }
    else if (number == 1) {
      return fibonacci + 1;
    }
    fibonacci += fiboMachine(number - 2) + fiboMachine(number - 1);
    return fibonacci;
  }
}

//  Write a function that computes a member of the fibonacci sequence by a given index
//  Create tests that covers all types of input (like in the previous workshop exercise)