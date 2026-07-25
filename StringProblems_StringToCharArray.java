import java.util.*;

public class StringProblems_StringToCharArray {

    // 16. Convert String to char[] without .toCharArray()
    public static char[] stringToCharArray(String str) {
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        return chars;
    }

    public static void main(String[] args) {
        System.out.println("Convert String to char[]: "
                + Arrays.toString(stringToCharArray("hello")));
    }
}