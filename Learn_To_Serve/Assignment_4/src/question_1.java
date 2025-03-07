import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class question_1 {
    public static void main(String[] args) {
        System.out.println("Write a program to get cube for numbers 1-10 and filter anything that is divisible by 5");

        List<Integer> list2= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result=list2.stream()
                                  .map(n -> n * n * n)//cube over here
                                  .filter(cube -> cube % 5 != 0)//filtering if n is divisible by 5
                                  .collect(Collectors.toList());
        System.out.println(result);
        System.out.println("____________________________________________________________________________________________________");
    }
}
