package sorting.income;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    Income income = new Income(new int[]{120, 256, 54, 586, 150, 520, 428});

    @Test
    void testGetHighestIncome() {
        assertEquals(586, income.getHighestIncome());
    }
}
