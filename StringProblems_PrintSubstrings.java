import java.util.*;

public class StringProblems_PrintSubstrings {

    // 25. Print all substrings of a string
    public static void printSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        printSubstrings("abc");
    }
}