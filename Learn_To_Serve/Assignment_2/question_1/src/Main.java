import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws question3 {

        // Task 1
        System.out.println("1. write a program to merge 2 sorted lists into 1 sorted list.");

        // Creating two lists to hold random integers
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        // Using Random to generate random integers between 0 and 19
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list1.add(r.nextInt(20));  // Adding random integers to list1
            list2.add(r.nextInt(20));  // Adding random integers to list2
        }

        // Sorting both lists to ensure they are in ascending order
        Collections.sort(list1);
        Collections.sort(list2);

        // Merging the two sorted lists using the merge method from question1 class
        System.out.println(question1.merge(list1, list2));
        System.out.println("-------------------------------------------------------------------------");

        // Task 2
        System.out.println("2. Write a program to catch arithmetic exception while dividing 2 numbers and divisor is 0");

        // Calling Arithmatic method from question2 class to simulate division and catch exception
        question2.Arithmatic(30, 0);
        System.out.println("-------------------------------------------------------------------------");

        // Task 3
        System.out.println("3. Write a program that will handle a custom exception (you can choose the use case as you like)");

        // Throwing a custom exception defined in question3 class
        throw new question3("This is custom exception");
    }
}