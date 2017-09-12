public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int[] aj = {3, 4, 5, 6 ,7};
        
        int[] ja = new int[aj.length];
        
        for (int i = 0; i < ja.length; i++) {
            ja[i] = aj[i];
        }

        for (int j = 0; j < ja.length; j++) {
            aj[j] = ja[(ja.length - 1) - j];
        }

        for (int k = 0; k < aj.length; k++) {
            System.out.println(aj[k]);
        }
    }
}