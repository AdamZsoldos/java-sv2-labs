package collectionsiterator.xmas;

import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

    private final List<ChristmasPresent> presents;

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public List<ChristmasPresent> getPresents() {
        return presents;
    }

    public void addNewPresent(ChristmasPresent present) {
        presents.add(present);
    }

    public void removeOverpricedPresents(int maxPrice) {
        Iterator<ChristmasPresent> iterator = presents.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPrice() > maxPrice) {
                iterator.remove();
            }
        }
    }
}
