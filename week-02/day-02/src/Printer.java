public class Printer {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `printer`
        //   which prints the input String parameters
        // - It can have any number of parameters

        // Examples
        // printer("first")
        // printer("first", "second")
        // printer("first", "second", "third", "fourth")
        // ...

        String[] inputStrings = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth"};
        System.out.println(printer(inputStrings));
    }

    public static String printer(String[] text) {
        String printedText = "";

        for(int i = 0; i < text.length; i++) {
            printedText = printedText + " " + text[i];
        }
        return printedText;
    }
}