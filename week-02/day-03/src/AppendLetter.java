import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        ArrayList<String> far = new ArrayList<>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        // Add "a" to every string in the far list.

        ListIterator<String> literator = far.listIterator();

        while (literator.hasNext()) {
            far.set(literator.nextIndex(), literator.next() + "a");
        }
        System.out.println(far);
    }
}