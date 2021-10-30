package stringseparate;

import java.util.List;

public class Codes {

    private Codes() {
        throw new IllegalStateException("Utility class");
    }

    public static String getCodesStartingWithLetters(List<String> codes) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String code : codes) {
            if (Character.isAlphabetic(code.charAt(0))) {
                if (first) first = false;
                else sb.append(", ");
                sb.append(code);
            }
        }
        return sb.toString();
    }
}
