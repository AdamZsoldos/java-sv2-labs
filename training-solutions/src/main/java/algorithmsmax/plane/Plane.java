package algorithmsmax.plane;

public class Plane {

    private Plane() {
        throw new IllegalStateException("Utility class");
    }

    public static int getLongestOcean(String map) {
        int longest = 0;
        int current = 0;
        for (char c : map.toCharArray()) {
            if (c == '0') {
                current++;
                if (current > longest) longest = current;
            } else {
                current = 0;
            }
        }
        return longest;
    }
}
