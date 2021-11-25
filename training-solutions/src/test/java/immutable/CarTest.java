package immutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    int currentYear = LocalDate.now().getYear();

    @Test
    void testCreate() {
        Car car = new Car("Ford", "Focus", currentYear);
        assertEquals("Ford", car.getManufacturer());
        assertEquals("Focus", car.getModel());
        assertEquals(currentYear, car.getYearOfProduction());
    }

    @Test
    void testCreateManufacturerNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Car(null, "Focus", currentYear));
        assertEquals("Manufacturer cannot be null!", e.getMessage());
    }

    @Test
    void testCreateManufacturerBlank() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Car("  \n\r ", "Focus", currentYear));
        assertEquals("Manufacturer cannot be blank!", e.getMessage());
    }

    @Test
    void testCreateYearOfProductionOverMax() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Car("Ford", "Focus", currentYear + 1));
        assertEquals("Year of production cannot exceed maximum value of current year!", e.getMessage());
    }
}
