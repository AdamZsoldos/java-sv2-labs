package chars;

public class Words {

    public static void main(String[] args) {
        System.out.println("alma -> " + Words.pushWord("alma"));
        System.out.println("körte -> " + Words.pushWord("körte"));
        System.out.println("barack -> " + Words.pushWord("barack"));
    }

    public static String pushWord(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) chars[i]++;
        return new String(chars);
    }
}
