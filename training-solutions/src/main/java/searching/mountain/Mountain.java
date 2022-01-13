package searching.mountain;

import java.util.Arrays;

public class Mountain {

    private final int[] pikes;

    public Mountain(int[] pikes) {
        this.pikes = pikes;
        Arrays.sort(this.pikes);
    }

    public int[] getPikes() {
        return pikes;
    }

    public boolean searchPike(Pike pike) {
        return Arrays.binarySearch(pikes, pike.getHeight()) >= 0;
    }
}
