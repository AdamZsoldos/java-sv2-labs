package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigBossTest {

    BigBoss bigBoss = new BigBoss("John Doe", "1200 Example Street", 1000, 12, 500);

    @Test
    void testCreate() {
        assertEquals("John Doe", bigBoss.getName());
        assertEquals("1200 Example Street", bigBoss.getAddress());
        assertEquals(12, bigBoss.getNumberOfEmployees());
        assertEquals(500, bigBoss.getBonus());
    }

    @Test
    void testGetSalary() {
        assertEquals(2700, bigBoss.getSalary());
    }

    @Test
    void testRaiseSalary() {
        bigBoss.raiseSalary(10);
        assertEquals(2920, bigBoss.getSalary());
    }
}
