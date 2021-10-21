package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>(Arrays.asList(3, 4));

        for (int i = 0; i < 5; i++) elements.add(elements.get(i) * elements.get(i + 1));

        System.out.println("elements: " + elements + " (" + elements.size() + ")");
    }
}
