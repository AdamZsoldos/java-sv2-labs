package controlselection.consonant;

public class ToConsonant {

    private ToConsonant() {
        throw new IllegalStateException("Utility class");
    }

    public static char toConsonant(char c) {
        if (!Character.isAlphabetic(c)) return 0;
        return switch (Character.toLowerCase(c)) {
            case 'a' -> 'b';
            case 'e' -> 'f';
            case 'i' -> 'j';
            case 'o' -> 'p';
            case 'u' -> 'v';
            default -> Character.toLowerCase(c);
        };
    }
}
