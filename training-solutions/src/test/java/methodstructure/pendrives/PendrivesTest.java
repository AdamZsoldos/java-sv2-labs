package methodstructure.pendrives;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PendrivesTest {

    List<Pendrive> pendrives = Arrays.asList(
            new Pendrive("Maxell", 500, 6000),
            new Pendrive("Kingston", 1000, 15000),
            new Pendrive("Toshiba", 50, 1000)
    );

    @Test
    void testGetBest() {
        assertEquals("Maxell", Pendrives.getBest(pendrives).getName());
    }

    @Test
    void testGetCheapest() {
        assertEquals("Toshiba", Pendrives.getCheapest(pendrives).getName());
    }

    @Test
    void testRaisePriceAtCapacityBy() {
        Pendrives.raisePriceAtCapacityBy(pendrives, 10, 1000);
        assertEquals(6000, pendrives.get(0).getPrice());
        assertEquals(16500, pendrives.get(1).getPrice());
        assertEquals(1000, pendrives.get(2).getPrice());
    }
}
