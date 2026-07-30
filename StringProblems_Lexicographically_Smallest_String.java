import java.util.*;

public class StringProblems_Lexicographically_Smallest_String {

    // 29. Find the lexicographically smallest string
    public static String smallestLexicographic(String[] arr) {

        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {

        String[] arr = {"banana", "apple", "cherry"};

        System.out.println("Smallest Lexicographic: "
                + smallestLexicographic(arr));
    }
}