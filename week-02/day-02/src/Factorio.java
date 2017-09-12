public class Factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        int number = 5;
        System.out.println(factorio(number));
    }

    public static int factorio(int num) {
        int numFact = 1;
        for(int i = 1; i < (num + 1); i++) {
            numFact *= i;
        }
        return numFact;
    }
}