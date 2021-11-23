package algorithmscount.height;

import java.util.List;

public class Height {

    private Height() {
        throw new IllegalStateException("Utility class");
    }

    public static int countChildrenTallerThan(List<Integer> heightValues, int minHeight) {
        int count = 0;
        for (int height : heightValues) {
            if (height >= minHeight) count++;
        }
        return count;
    }
}
