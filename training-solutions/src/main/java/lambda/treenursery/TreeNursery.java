package lambda.treenursery;

import java.util.ArrayList;
import java.util.List;

public class TreeNursery {

    private final List<Sapling> saplings = new ArrayList<>();

    public List<Sapling> getSaplings() {
        return saplings;
    }

    public void prune(int maxHeight) {
        saplings.forEach(sapling -> sapling.cut(maxHeight));
    }

    public void sell(String species, int minHeight) {
        saplings.removeIf(sapling -> sapling.getSpecies().equals(species) && sapling.getHeight() >= minHeight);
    }
}
