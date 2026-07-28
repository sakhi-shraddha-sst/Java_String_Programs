import java.util.*;

public class StringProblems_IsSubstring {

    // 24. Implement isSubstring() without contains()
    public static boolean isSubstring(String str, String sub) {
        return str.indexOf(sub) != -1;
    }

    public static void main(String[] args) {
        System.out.println("isSubstring: "
                + isSubstring("hello world", "world"));
    }
}