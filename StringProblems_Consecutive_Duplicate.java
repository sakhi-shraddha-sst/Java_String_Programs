import java.util.*;

public class StringProblems_Consecutive_Duplicate {

    // 31. Remove consecutive duplicate words from a sentence
    public static String removeConsecutiveDuplicates(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        String prev = "";

        for (String word : words) {
            if (!word.equals(prev)) {
                sb.append(word).append(" ");
                prev = word;
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {

        System.out.println("Removed Duplicates: "
                + removeConsecutiveDuplicates(
                "hello hello world world java java"));

        System.out.println("Removed Duplicates: "
                + removeConsecutiveDuplicates(
                "I I love love Java Java"));

        System.out.println("Removed Duplicates: "
                + removeConsecutiveDuplicates(
                "one two two three three four"));
    }
}