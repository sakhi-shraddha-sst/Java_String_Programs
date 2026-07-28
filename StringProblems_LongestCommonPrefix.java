import java.util.*;

public class StringProblems_LongestCommonPrefix {

    // 23. Find longest common prefix in an array of strings
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        String prefix = strs[0];

        for (String str : strs) {
            while (!str.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        System.out.println("Longest Prefix: "
                + longestCommonPrefix(new String[] {
                        "flower",
                        "flow",
                        "flight"
                }));
    }
}