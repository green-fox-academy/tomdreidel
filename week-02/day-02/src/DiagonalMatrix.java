public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int[][] myArray = new int[4][4];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i == j) {
                    myArray[i][j] = 1;
                }
                else {
                    myArray[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}