
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class question1 {
    public static List<Integer> merge(List<Integer> a, List<Integer> b) {
            // Adding all elements of list 'a' to list 'b'
            b.addAll(a);

            // Sorting the merged list in ascending order
            Collections.sort(b);

            // Returning the sorted list
            return b;
    }
}
