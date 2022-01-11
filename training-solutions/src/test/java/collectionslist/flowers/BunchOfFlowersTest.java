package collectionslist.flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {

    BunchOfFlowers bunch = new BunchOfFlowers();

    @Test
    void testCreate() {
        assertEquals(0, bunch.getFlowers().size());
    }

    @Test
    void testAddFlowerInTheMiddle() {
        bunch.addFlowerInTheMiddle("Tulip");
        assertEquals(List.of("Tulip"), bunch.getFlowers());
        bunch.addFlowerInTheMiddle("Rose");
        assertEquals(List.of("Rose", "Tulip", "Rose"), bunch.getFlowers());
        bunch.addFlowerInTheMiddle("Daisy");
        assertEquals(List.of("Rose", "Daisy", "Tulip", "Daisy", "Rose"), bunch.getFlowers());
        bunch.getFlowers().remove("Rose");
        assertEquals(List.of("Daisy", "Tulip", "Daisy", "Rose"), bunch.getFlowers());
        bunch.addFlowerInTheMiddle("Crocus");
        assertEquals(List.of("Daisy", "Tulip", "Crocus", "Daisy", "Rose"), bunch.getFlowers());
    }
}
