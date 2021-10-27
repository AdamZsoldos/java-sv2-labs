package chars;

public class Words {

    public static void main(String[] args) {
        System.out.println(Words.pushWord("alma"));
        System.out.println(Words.pushWord("körte"));
        System.out.println(Words.pushWord("barack"));
    }

    public static String pushWord(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) chars[i]++;
        return new String(chars);
    }
}
