import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class question_4 {
    public static List<String> isduplicate(String[] a){
        HashSet<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            String s = a[i];
            if(set.contains(s)){
                list.add(s);
            }
            else {
                set.add(s);
            }
        }
        return list;
    }
}
