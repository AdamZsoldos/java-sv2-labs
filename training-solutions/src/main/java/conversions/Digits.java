package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {

    private final List<Integer> digitList = new ArrayList<>();

    public static void main(String[] args) {
        Digits d = new Digits();
        d.addDigits("rip0q1bvewvbrpq2buueprzr3u4egte56o7b8go9");
        System.out.println(d.getDigits());
    }

    public List<Integer> getDigits() {
        return digitList;
    }

    public void addDigits(String text) {
        char[] chars = text.toCharArray();
        for (char c: chars) {
            if (Character.isDigit(c)) digitList.add(Integer.parseInt(String.valueOf(c)));
        }
    }
}
