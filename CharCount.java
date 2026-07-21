public class CharCount {
    public static int countChar(String str, char ch) {
        return (int) str.chars().filter(c -> c == ch).count();
    }

    public static void main(String[] args) {
        System.out.println(countChar(""hello"", 'l')); // 2
    }
}