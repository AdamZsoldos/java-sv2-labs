package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class CodesMain {
    public static void main(String[] args) {

        List<String> codes = new ArrayList<>();
        codes.add("yPASdLbV");
        codes.add("9yXpN8zk");
        codes.add("incbBofD");
        codes.add("A7oJcJ9d");
        codes.add("xWVtBFLY");
        codes.add("8VzPug32");
        codes.add("2oPHSVGH");
        codes.add("DzGfWagM");
        codes.add("3oTWGq49");

        System.out.println();
        System.out.println("Codes: " + codes);
        System.out.println();
        System.out.println("Codes starting with letters: " + Codes.getCodesStartingWithLetters(codes));
    }
}
