package collectionsautoboxing.paper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {

    Paper paper = new Paper();

    @BeforeEach
    void setUp() {
        paper.putMorePaper("1.a", 235);
        paper.putMorePaper("5.b", 421);
        paper.putMorePaper("8.a", 398);
    }

    @Test
    void testCreate() {
        assertEquals(3, paper.getPaperPerClass().size());
        assertEquals(235, paper.getPaperPerClass().get("1.a"));
        assertEquals(421, paper.getPaperPerClass().get("5.b"));
        assertEquals(398, paper.getPaperPerClass().get("8.a"));
    }

    @Test
    void testPutMorePaper() {
        paper.putMorePaper("1.a", 12);
        assertEquals(247, paper.getPaperPerClass().get("1.a"));
    }

    @Test
    void testGetWinnerClass() {
        assertEquals("5.b", paper.getWinnerClass());
    }

    @Test
    void testGetTotalWeight() {
        assertEquals(1054, paper.getTotalWeight());
    }
}
