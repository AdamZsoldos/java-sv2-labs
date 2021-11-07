package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabelsTest {

    @Test
    void testGetTableOfNumbers() {
        int[][] table = new Labels().getTableOfNumbers(5);
        assertEquals(5, table.length);
        assertEquals(5, table[0].length);
        assertEquals(2, table[0][0]);
        assertEquals(6, table[0][4]);
        assertEquals(6, table[4][0]);
        assertEquals(10, table[4][4]);
    }
}
