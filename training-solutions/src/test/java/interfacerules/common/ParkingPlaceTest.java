package interfacerules.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingPlaceTest {

    @Test
    void testCreate() {
        ParkingPlace pp = new ParkingPlace();
        assertEquals(2.2, pp.getWidth());
        assertEquals(5, pp.getLength());
    }
}
