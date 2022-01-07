package exceptionmulticatch.aid;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AidTest {

    Aid aid = new Aid(1_489_600);

    @Test
    void testGetAidPerCapitaBySettlement() {
        List<String> expected = List.of(
                "Budapest: 1489600",
                "Kukutyin: 53200",
                "Kiskunalsófelső: 2800"
        );
        assertEquals(expected, aid.getAidPerCapitaBySettlement(Path.of("src/test/resources/population1.txt")));
    }

    @Test
    void testGetAidPerCapitaBySettlementThrowsIOOBE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> aid.getAidPerCapitaBySettlement(Path.of("src/test/resources/population2.txt")));
        assertEquals("Invalid operation", e.getMessage());
        assertTrue(e.getCause() instanceof IndexOutOfBoundsException);
    }

    @Test
    void testGetAidPerCapitaBySettlementThrowsNFE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> aid.getAidPerCapitaBySettlement(Path.of("src/test/resources/population3.txt")));
        assertEquals("Invalid operation", e.getMessage());
        assertTrue(e.getCause() instanceof NumberFormatException);
    }

    @Test
    void testGetAidPerCapitaBySettlementThrowsAE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> aid.getAidPerCapitaBySettlement(Path.of("src/test/resources/population4.txt")));
        assertEquals("Invalid operation", e.getMessage());
        assertTrue(e.getCause() instanceof ArithmeticException);
    }

    @Test
    void testGetAidPerCapitaBySettlementThrowsIOE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> aid.getAidPerCapitaBySettlement(Path.of("src/test/resources/population5.txt")));
        assertEquals("Invalid operation", e.getMessage());
        assertTrue(e.getCause() instanceof IOException);
    }

    @Test
    void testGetAidPerCapitaBySettlementThrowsNPE() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> aid.getAidPerCapitaBySettlement(null));
        assertEquals("Invalid operation", e.getMessage());
        assertTrue(e.getCause() instanceof NullPointerException);
    }
}
