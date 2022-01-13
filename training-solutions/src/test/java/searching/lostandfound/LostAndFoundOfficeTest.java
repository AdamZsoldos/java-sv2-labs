package searching.lostandfound;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LostAndFoundOfficeTest {

    LostAndFoundOffice office = new LostAndFoundOffice();

    @BeforeEach
    void setUp() {
        office.getLostProperties().add(new LostProperty(1035, "Keys", LocalDate.now().minusDays(3)));
        office.getLostProperties().add(new LostProperty(259, "Purse", LocalDate.now().minusDays(15)));
        office.getLostProperties().add(new LostProperty(567, "Hat", LocalDate.now().minusDays(22)));
    }

    @Test
    void testFindLostProperty() {
        LostProperty property = office.findLostProperty("Purse");
        assertEquals(259, property.getRegistryNumber());
        assertEquals("Purse", property.getDescription());
        assertEquals(LocalDate.now().minusDays(15), property.getDateRegistered());
    }

    @Test
    void testFindLostPropertyNotFound() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> office.findLostProperty("Purses"));
        assertEquals("Property not found", e.getMessage());
    }
}
