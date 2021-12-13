package isahasa.inhabitant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InhabitantTest {

    Inhabitant inhabitant = new Inhabitant("John Doe", new ParkingPlace(1));

    @Test
    void testCreate() {
        assertEquals("John Doe", inhabitant.getName());
        assertEquals(1, inhabitant.getParkingPlace().getId());
    }

    @Test
    void testChangeParkingPlace() {
        inhabitant.changeParkingPlace(2);
        assertEquals(2, inhabitant.getParkingPlace().getId());
    }
}
