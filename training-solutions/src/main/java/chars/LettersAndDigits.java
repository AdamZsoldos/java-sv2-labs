package chars;

public class LettersAndDigits {

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit("bfa68fF;X");
    }

    public void printLetterOrDigit(String string) {
        for (char c: string.toCharArray()) {
            System.out.println(c + ": " + getCharacterType(c));
        }
    }

    private String getCharacterType(char c) {
        if (Character.isAlphabetic(c)) return "letter";
        if (Character.isDigit(c)) return "digit";
        return "other";
    }
}
