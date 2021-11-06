package controlselection.accents;

public class WithoutAccents {

    private WithoutAccents() {
        throw new IllegalStateException("Utility class");
    }

    public static char removeAccents(char c) {
        if (!Character.isAlphabetic(c)) return 0;
        return switch (c) {
            case 'á' -> 'a';
            case 'Á' -> 'A';
            case 'é' -> 'e';
            case 'É' -> 'E';
            case 'í' -> 'i';
            case 'Í' -> 'I';
            case 'ó', 'ö', 'ő' -> 'o';
            case 'Ó', 'Ö', 'Ő' -> 'O';
            case 'ú', 'ü', 'ű' -> 'u';
            case 'Ú', 'Ü', 'Ű' -> 'U';
            default -> c;
        };
    }
}
