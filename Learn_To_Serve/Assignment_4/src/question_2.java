import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class question_2 {
    public static void main(String[] args) {
        System.out.println("For a given String count the times each letter is repeated. For eg. given \"Jay Swaminarayan\" - count for J is 1, Count for a is 4, count for y is 2, etc... :");

        String s = "Jay Swaminarayan";
        List<Character> charList = s.toLowerCase()//string s to lowercase
                                        .chars()//string to character
                                        .filter(Character::isLetter)//space character, which gets filtered out
                                        .mapToObj(c -> (char) c)//int to character
                                        .collect(Collectors.toList());
        System.out.println(charList);

        Map<Character, Long> result = charList.stream()
                                              .collect(Collectors.groupingBy(c -> c, Collectors.counting()));//mapping characters to integer

        System.out.println(result);
    }
}
