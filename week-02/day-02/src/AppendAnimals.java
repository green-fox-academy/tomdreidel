public class AppendAnimals {
    public static void main(String[] args) {
        // - Create an array variable named `nimals`
        //   with the following content: `["kuty", "macsk", "cic"]`
        // - Add all elements an `"a"` at the end

        String[] nimals = {"kuty", "macsk", "cic"};

        for (int i = 0; i < nimals.length; i++) {
            System.out.println(appender(nimals[i]));
        }
    }

    public static String appender(String nimalsToCorrect) {
       return nimalsToCorrect = nimalsToCorrect + "a";
    }
}