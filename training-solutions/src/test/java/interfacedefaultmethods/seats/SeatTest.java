package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void testGetNumberOfFamilyCarSeats() {
        assertEquals(5, new FamilyCar().getNumberOfSeats());
    }

    @Test
    void testGetNumberOfSportsCarSeats() {
        assertEquals(2, new SportsCar().getNumberOfSeats());
    }

    @Test
    void testGetNumberOfCarSeats() {
        assertEquals(4, new Car("Volvo", 4).getNumberOfSeats());
    }
}
