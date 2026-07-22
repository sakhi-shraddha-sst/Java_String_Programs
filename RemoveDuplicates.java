import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {

        Set<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
    }
}