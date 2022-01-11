package collectionslist.flowers;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {

    private final List<String> flowers = new LinkedList<>();

    public List<String> getFlowers() {
        return flowers;
    }

    public void addFlowerInTheMiddle(String flower) {
        int middleIndex = flowers.size() / 2;
        if (middleIndex * 2 == flowers.size()) {
            flowers.add(middleIndex, flower);
        } else {
            flowers.add(middleIndex + 1, flower);
            flowers.add(middleIndex, flower);
        }
    }
}
