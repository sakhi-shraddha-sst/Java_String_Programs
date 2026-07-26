import java.util.*;

public class StringProblems_ReverseWords {

    // 19. Reverse words in a sentence
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println("Reverse Words: "
                + reverseWords("hello world from java"));
    }
}