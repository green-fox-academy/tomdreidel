public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverser(reversed));
        System.out.println(anotherReverser(reversed));
    }

    public static String reverser (String original) {
        String reversed = "";

        for (int i = 0; i < original.length(); i++) {
            reversed = reversed + original.charAt((original.length() - 1) - i);
        }
        return original = reversed;
    }

    public static String anotherReverser (String original) {
       String reversed = new StringBuilder(original).reverse().toString();
       return original = reversed;
    }
}