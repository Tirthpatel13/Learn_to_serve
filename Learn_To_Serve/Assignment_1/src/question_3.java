import java.util.ArrayList;
import java.util.Map;

public class question_3 {
    public static ArrayList<String> SetAndValue(Map<Integer, Integer> m) {
        ArrayList<String> array = new ArrayList<>();
        for (Map.Entry<Integer, Integer> a : m.entrySet()) {
            String key = String.valueOf(a.getKey());
            String value = String.valueOf(a.getValue());
            array.add("Key: " + key + ", Value: " + value);
        }
        return array;
    }
}
