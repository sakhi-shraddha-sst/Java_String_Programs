import java.util.*;

public class StringProblems_LongestWord {

    // 11. Find the longest word in a sentence
    public static String longestWord(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    public static void main(String[] args) {
        System.out.println("Longest Word: "
                + longestWord("Java is a powerful programming language"));
    }
}