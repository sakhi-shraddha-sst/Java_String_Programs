import java.util.*;

public class StringProblems_StrStr {

    // 21. Implement strStr() function (Find substring index)
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println("strStr: "
                + strStr("hello", "ll"));
    }
}