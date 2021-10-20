package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {

        List<String> contents = new ArrayList<>();

        contents.add("Ice cubes");
        contents.add("Broccoli");
        contents.add("Ice cream");
        contents.add("French fries");
        contents.add("Cheese nuggets");

        System.out.println(contents + " (" + contents.size() + ")");

        contents.remove(2);
        contents.remove(3);

        System.out.println(contents + " (" + contents.size() + ")");
    }
}
