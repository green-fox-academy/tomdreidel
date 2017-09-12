public class Sum {

    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter

        int number = 9;
        System.out.println(numberSummer(number));
    }

    public static int numberSummer(int num) {

        int sumValue = 0;
        for(int i = 0; i < (num + 1); i++) {
            sumValue += i;
        }
        return sumValue;
    }
}