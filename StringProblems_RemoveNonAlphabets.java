import java.util.*;

public class StringProblems_RemoveNonAlphabets {

    // 17. Remove all non-alphabetic characters from a string
    public static String removeNonAlphabets(String str) {
        return str.replaceAll("[^a-zA-Z]", "");
    }

    public static void main(String[] args) {
        System.out.println("Remove Non-Alphabets: "
                + removeNonAlphabets("h3ll0 w@r1d!"));
    }
}