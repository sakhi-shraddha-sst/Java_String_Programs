import java.util.*;

public class StringProblems_CompressString {

    // 22. Compress a string (aaabb -> a3b2)
    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Compressed: "
                + compressString("aaabb"));
    }
}