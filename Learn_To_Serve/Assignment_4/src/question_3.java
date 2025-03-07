import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class question_3 {
    public static void main(String[] args) {
        System.out.println(" Find an average for numbers stored as values in a map. Eg. Map with EmployeeID and Age etc :");
        //map with EmployeeID and Age
        Map<Integer, Integer> ID_And_Age = Map.of(
                101, 25,
                102, 30,
                103, 28,
                104, 35,
                105, 40
        );

        List<Integer> ages = new ArrayList<>(ID_And_Age.values());
        Double avg = ages.stream()
                                .collect(Collectors.averagingInt(age -> age));//calculating average age

        System.out.println("Average age of employees: " + avg);
    }
}
