import java.util.ArrayList;
import java.util.List;

public class question_2 {
    public static boolean isSubset(List<Integer> l1, List<Integer> l2) {
        int m=l1.size(),n=l2.size();
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if (l2.get(i) == l1.get(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }
}

