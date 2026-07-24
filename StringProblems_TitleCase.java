import java.util.*;

public class StringProblems_TitleCase {

    public static String toTitleCase(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1).toLowerCase())
              .append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("Title Case: "
                + toTitleCase("hello world from java"));
    }
}