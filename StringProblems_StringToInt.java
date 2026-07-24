import java.util.*;

public class StringProblems_StringToInt {

    public static int stringToInt(String str) {
        int num = 0;

        for (char c : str.toCharArray()) {
            num = num * 10 + (c - '0');
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println("String to Integer: "
                + stringToInt("1234"));
    }
}