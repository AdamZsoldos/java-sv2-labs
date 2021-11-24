package algorithmsmax.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    List<Salesperson> salespeople = Arrays.asList(
            new Salesperson("John Doe", 55, 50),
            new Salesperson("Jane Doe", 140, 150),
            new Salesperson("Jack Doe", 170, 200),
            new Salesperson("Jill Doe", 110, 70),
            new Salesperson("Jeff Doe", 91, 90),
            new Salesperson("Jenn Doe", 25, 20)
    );

    @Test
    void testSelectSalesPersonWithMaxSalesAmount() {
        assertEquals("Jack Doe", Sales.selectSalesPersonWithMaxSalesAmount(salespeople).getName());
    }

    @Test
    void testSelectSalesPersonWithFurthestAboveTarget() {
        assertEquals("Jill Doe", Sales.selectSalesPersonWithFurthestAboveTarget(salespeople).getName());
    }

    @Test
    void testSelectSalesPersonWithFurthestBelowTarget() {
        assertEquals("Jack Doe", Sales.selectSalesPersonWithFurthestBelowTarget(salespeople).getName());
    }
}
