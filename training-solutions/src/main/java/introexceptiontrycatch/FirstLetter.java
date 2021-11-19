package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World", "", "Nice", "Day", "Today");

        try {
            for (int i = 0; i <= words.size(); i++) {
                System.out.println(words.get(i).charAt(0));
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            for (int i = 3; i <= words.size(); i++) {
                System.out.println(words.get(i).charAt(0));
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            words.add("Goodbye");
        }
        catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
