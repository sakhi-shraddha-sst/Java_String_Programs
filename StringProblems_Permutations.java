import java.util.*;

public class StringProblems_Permutations {

    public static void permute(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            permute(
                str.substring(0, i) + str.substring(i + 1),
                result + str.charAt(i)
            );
        }
    }

    public static void main(String[] args) {
        System.out.println("Permutations of 'abc':");
        permute("abc", "");
    }
}