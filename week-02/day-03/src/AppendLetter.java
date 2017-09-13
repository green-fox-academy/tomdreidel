import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        ArrayList<String> far = new ArrayList<>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        // Add "a" to every string in the far list.

        ListIterator<String> iteratorAnimal = far.listIterator();

        while (iteratorAnimal.hasNext()) {
            far.set(iteratorAnimal.nextIndex(), iteratorAnimal.next() + "a");
        }
        System.out.println(far);
    }
}