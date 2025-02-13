import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question_5 {
    public static boolean ALA(String[] a) {
        List<String> list5 = new ArrayList<>(Arrays.asList(a));
        String[] a2 = list5.toArray(new String[list5.size()]);
        return Arrays.equals(a2, a);
    }
}
