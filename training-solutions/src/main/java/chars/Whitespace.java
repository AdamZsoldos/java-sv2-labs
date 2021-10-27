package chars;

public class Whitespace {

    public static void main(String[] args) {
        System.out.println(Whitespace.makeWhitespaceToStar("alma körte barack\ncseresznye"));
    }

    public static String makeWhitespaceToStar(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i])) chars[i] = '*';
        }
        return new String(chars);
    }
}
