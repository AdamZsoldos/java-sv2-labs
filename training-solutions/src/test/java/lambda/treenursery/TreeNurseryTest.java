package lambda.treenursery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNurseryTest {

    TreeNursery treeNursery;

    @BeforeEach
    void setUp() {
        treeNursery = new TreeNursery();
        treeNursery.getSaplings().add(new Sapling("Maple", 120));
        treeNursery.getSaplings().add(new Sapling("Hazelnut", 200));
        treeNursery.getSaplings().add(new Sapling("Maple", 160));
    }

    @Test
    void testPrune() {
        treeNursery.prune(150);
        assertEquals(120, treeNursery.getSaplings().get(0).getHeight());
        assertEquals(150, treeNursery.getSaplings().get(1).getHeight());
        assertEquals(150, treeNursery.getSaplings().get(2).getHeight());
    }

    @Test
    void testSell() {
        treeNursery.sell("Maple", 150);
        assertEquals(2, treeNursery.getSaplings().size());
        assertEquals("Maple", treeNursery.getSaplings().get(0).getSpecies());
        assertEquals(120, treeNursery.getSaplings().get(0).getHeight());
        assertEquals("Hazelnut", treeNursery.getSaplings().get(1).getSpecies());
        assertEquals(200, treeNursery.getSaplings().get(1).getHeight());
    }
}
