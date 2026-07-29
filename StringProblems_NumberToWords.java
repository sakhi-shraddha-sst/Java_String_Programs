import java.util.*;

public class StringProblems_NumberToWords {

    // 26. Convert a number to words (123 -> "One Hundred Twenty-Three")
    public static String numberToWords(int num) {

        String[] belowTen = {
                "", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        String[] belowTwenty = {
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String[] belowHundred = {
                "", "", "Twenty", "Thirty", "Forty",
                "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        if (num < 10)
            return belowTen[num];

        if (num < 20)
            return belowTwenty[num - 10];

        if (num < 100)
            return belowHundred[num / 10] + " " + belowTen[num % 10];

        return belowTen[num / 100] + " Hundred " + numberToWords(num % 100);
    }

    public static void main(String[] args) {
        System.out.println("Number to Words: " + numberToWords(100));
    }
}