package algorithmsmax.hill;

import java.util.List;

public class Hill {

    private Hill() {
        throw new IllegalStateException("Utility class");
    }

    public static int getMax(List<Integer> heightValues) {
        int max = Integer.MIN_VALUE;
        for (int height : heightValues) {
            if (height > max) max = height;
        }
        return max;
    }
}
