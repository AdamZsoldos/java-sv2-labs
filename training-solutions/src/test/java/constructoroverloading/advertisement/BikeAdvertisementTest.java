package constructoroverloading.advertisement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdvertisementTest {

    @Test
    void testCreate() {
        BikeAdvertisement advert = new BikeAdvertisement("Child's bike for sale", 50);
        conductAsserts(advert, "Child's bike for sale", 50, List.of(), "N/A", "N/A");

        advert = new BikeAdvertisement("Child's bike for sale", 50, Arrays.asList("lamp", "bike lock"));
        conductAsserts(advert, "Child's bike for sale", 50, List.of("lamp", "bike lock"), "N/A", "N/A");

        advert = new BikeAdvertisement("Child's bike for sale", 50, Arrays.asList("lamp", "bike lock"), "BMX");
        conductAsserts(advert, "Child's bike for sale", 50, List.of("lamp", "bike lock"), "BMX", "N/A");

        advert = new BikeAdvertisement("Child's bike for sale", 50, Arrays.asList("lamp", "bike lock"), "BMX", "111111");
        conductAsserts(advert, "Child's bike for sale", 50, List.of("lamp", "bike lock"), "BMX", "111111");
    }

    void conductAsserts(BikeAdvertisement advert, String description, int price, List<String> extras, String manufacturer, String serialNumber) {
        assertEquals(description, advert.getDescription());
        assertEquals(price, advert.getPrice());
        assertEquals(extras, advert.getExtras());
        assertEquals(manufacturer, advert.getManufacturer());
        assertEquals(serialNumber, advert.getSerialNumber());
    }
}
