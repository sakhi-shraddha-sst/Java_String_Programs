import java.util.*;

public class StringProblems_WordFrequency {

    public static void wordFrequency(String sentence) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : sentence.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void main(String[] args) {
        System.out.println("Word Frequency in 'java java python c++ c++ java':");
        wordFrequency("java java python c++ c++ java");
    }
}