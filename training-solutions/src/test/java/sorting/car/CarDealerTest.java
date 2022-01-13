package sorting.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarDealerTest {

    CarDealer dealer = new CarDealer();

    @BeforeEach
    void setUp() {
        dealer.getCarsForSale().add(new Car("Honda", 2000, 500));
        dealer.getCarsForSale().add(new Car("Ford", 2010, 700));
        dealer.getCarsForSale().add(new Car("Suzuki", 1990, 600));
    }

    @Test
    void testGetCarsForSaleSortedByPrice() {
        List<Car> cars = dealer.getCarsForSaleSortedByPrice();
        assertEquals("Honda", cars.get(0).getBrand());
        assertEquals("Suzuki", cars.get(1).getBrand());
        assertEquals("Ford", cars.get(2).getBrand());
        assertEquals("Honda", dealer.getCarsForSale().get(0).getBrand());
        assertEquals("Ford", dealer.getCarsForSale().get(1).getBrand());
        assertEquals("Suzuki", dealer.getCarsForSale().get(2).getBrand());
    }

    @Test
    void testGetCarsForSaleSortedByYearOfConstruction() {
        List<Car> cars = dealer.getCarsForSaleSortedByYearOfConstruction();
        assertEquals("Suzuki", cars.get(0).getBrand());
        assertEquals("Honda", cars.get(1).getBrand());
        assertEquals("Ford", cars.get(2).getBrand());
        assertEquals("Honda", dealer.getCarsForSale().get(0).getBrand());
        assertEquals("Ford", dealer.getCarsForSale().get(1).getBrand());
        assertEquals("Suzuki", dealer.getCarsForSale().get(2).getBrand());
    }
}
