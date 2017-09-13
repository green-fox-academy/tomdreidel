import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        // Can you do both the different approaches you tried in the previous one?

        ArrayList<Integer> checkList = new ArrayList<>(Arrays.asList(4, 8, 12, 16));

        System.out.println(arrayRadar(list, checkList));

        System.out.println(arrayFinder(list, checkList));
    }

    public static Boolean arrayRadar (ArrayList arrayInArray, ArrayList checkArray) {
        return arrayInArray.containsAll(checkArray);
    }

    public static Boolean arrayFinder (ArrayList arrayInArray, ArrayList checkArray) {

        boolean[] matchCounter = new boolean[checkArray.size()];

        int[] checkArrayToArray = new int[checkArray.size()];
        for (int i = 0; i < checkArray.size() ; i++) {
            checkArrayToArray[i] = Integer.parseInt(String.valueOf(checkArray.get(i)));
        }

        int[] arrayInArrayToArray = new int[arrayInArray.size()];
        for (int j = 0; j < arrayInArray.size(); j++) {
            arrayInArrayToArray[j] = Integer.parseInt(String.valueOf(arrayInArray.get(j)));
        }

        for (int k = 0; k < checkArrayToArray.length; k++) {
            for (int l = 0; l < arrayInArray.size(); l++) {
                if (checkArrayToArray[k] == Integer.parseInt(String.valueOf(arrayInArray.get(l)))) {
                    if (!matchCounter[k]) {
                        matchCounter[k] = true;
                    }
                }
            }
        }
        for (boolean b: matchCounter) {
            if(!b) return false;
        }
        return true;
    }
}