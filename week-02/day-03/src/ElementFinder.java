import java.util.*;

public class ElementFinder{
    public static void main(String... args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
        // Do this again with a different solution using different list functions!

        System.out.println(sevenFinder(arrayList));

        System.out.println(sevenSniffer(arrayList));

        System.out.println(sevenSearch(arrayList));
    }

    public static String sevenFinder (ArrayList sevenArray) {
        if (sevenArray.contains(7)) {
            return "Hoorray!";
        }
        return "Noooooo";
    }

    public static String sevenSniffer (ArrayList sevenArray) {
        ListIterator<Integer> numIterator = sevenArray.listIterator();
        while (numIterator.hasNext()) {
            if (numIterator.next() == 7) {
                return "Hoorray";
            }
        }
        return "Noooooo";
    }

    public static String sevenSearch (ArrayList sevenArray) {
        for (int i = 0; i < sevenArray.size(); i++) {
            if ((int) sevenArray.get(i) == 7) {
                return "Hoorray";
            }
        }
        return "Noooooo";
    }
}