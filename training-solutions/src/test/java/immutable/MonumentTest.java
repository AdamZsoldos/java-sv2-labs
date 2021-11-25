package immutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {

    String name = "Colosseum";
    String title = "Flavian amphitheatre";
    LocalDate date = LocalDate.now();
    String number = "111111";

    @Test
    void testCreate() {
        Monument monument = new Monument(name, title, date, number);
        assertEquals(name, monument.getName());
        assertEquals(title, monument.getTitle());
        assertEquals(date, monument.getDateOfRegistration());
        assertEquals(number, monument.getRegistryNumber());
    }

    @Test
    void testCreateNameNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Monument(null, title, date, number));
        assertEquals("Name cannot be empty!", e.getMessage());
    }

    @Test
    void testCreateTitleBlank() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Monument(name, "  \n\r ", date, number));
        assertEquals("Title cannot be empty!", e.getMessage());
    }

    @Test
    void testCreateDateNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Monument(name, title, null, number));
        assertEquals("Date of registration cannot be empty!", e.getMessage());
    }

    @Test
    void testCreateNumberNull() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Monument(name, title, date, null));
        assertEquals("Registry number cannot be empty!", e.getMessage());
    }
}
