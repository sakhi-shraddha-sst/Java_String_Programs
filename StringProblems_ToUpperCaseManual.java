import java.util.*;

public class StringProblems_ToUpperCaseManual {

    // 18. Convert lowercase to uppercase without toUpperCase()
    public static String toUpperCaseManual(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            sb.append((c >= 'a' && c <= 'z') ? (char) (c - 32) : c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("To UpperCase: "
                + toUpperCaseManual("hello"));
    }
}