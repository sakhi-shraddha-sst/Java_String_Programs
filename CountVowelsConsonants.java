public class CountVowelsConsonants {

    public static void countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1)
                vowels++;
            else if (Character.isLetter(ch))
                consonants++;
        }

        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    public static void main(String[] args) {
        countVowelsConsonants("Hello");
    }
}