package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testAddVehicle() {
        PublicVehicle v1 = new Bus(20, 12, "Volvo");
        PublicVehicle v2 = new Tram(120, 20, 3);
        PublicVehicle v3 = new Underground(3, 50, 8);
        PublicTransport pt = new PublicTransport();
        pt.addVehicle(v1);
        pt.addVehicle(v2);
        pt.addVehicle(v3);
        assertEquals(3, pt.getVehicles().size());
    }
}
