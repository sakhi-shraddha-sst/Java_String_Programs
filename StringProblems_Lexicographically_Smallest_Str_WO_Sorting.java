import java.util.*;

public class StringProblems_Lexicographically_Smallest_Str_WO_Sorting {

    public static String smallestLexicographic(String[] arr) {

        if (arr == null || arr.length == 0)
            return "";

        String smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(smallest) < 0) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {

        String[] arr = {"banana", "apple", "cherry"};

        System.out.println("Smallest Lexicographic: "
                + smallestLexicographic(arr));
    }
}