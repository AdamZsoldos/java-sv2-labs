package algorithmsrecursion;

public class Vowels {

    private Vowels() {
        throw new IllegalStateException("Utility class");
    }

    public static int getNumberOfVowels(String word) {
        if (word.length() < 1) return 0;
        int result = switch (word.charAt(0)) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> 1;
            default -> 0;
        };
        if (word.length() < 2) return result;
        return result + getNumberOfVowels(word.substring(1));
    }
}
