import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        // Can you do both the different approaches you tried in the previous one?

        ArrayList<Integer> checkList = new ArrayList<>(Arrays.asList(4, 8, 12, 16));

        System.out.println(arrayRadar(list, checkList));

//        System.out.println(arrayFinder(list, checkList));
//        need to revise this





    }

    public static Boolean arrayRadar (ArrayList arrayInArray, ArrayList checkArray) {
        return arrayInArray.containsAll(checkArray);
    }

//    public static Boolean arrayFinder (ArrayList arrayInArray, ArrayList checkArray) {
//        ArrayList<Boolean> evaluator = new ArrayList<>(Arrays.asList(true));
//
//        ListIterator<Integer> arrayIterator = arrayInArray.listIterator();
//        ListIterator<Integer> checkIterator = checkArray.listIterator();
//        while (checkIterator.hasNext()) {
//            while (arrayIterator.hasNext()) {
//                if ((int) checkIterator.next() == (int) arrayIterator.next()) {
//                    evaluator.add(true);
//                    break;
//                }
//            }
//        }
//        return !evaluator.contains(false);
//
//    }

}