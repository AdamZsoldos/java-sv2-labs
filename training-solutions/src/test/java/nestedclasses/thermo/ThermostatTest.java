package nestedclasses.thermo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {

    Thermostat thermostat = new Thermostat();
    Thermometer t1 = new Thermometer("Kitchen", 20);
    Thermometer t2 = new Thermometer("Bedroom", 25);
    Thermometer t3 = new Thermometer("Toilet", 23);

    @BeforeEach
    void setUp() {
        thermostat.addThermometer(t1);
        thermostat.addThermometer(t2);
        thermostat.addThermometer(t3);
    }

    @Test
    void testAddThermometer() {
        assertEquals(List.of("Kitchen"), thermostat.getRoomsToHeat());
    }

    @Test
    void testChangeTemperature() {
        t2.setTemperature(18);
        assertEquals(List.of("Kitchen", "Bedroom"), thermostat.getRoomsToHeat());
        t1.setTemperature(23);
        assertEquals(List.of("Bedroom"), thermostat.getRoomsToHeat());
    }
}
