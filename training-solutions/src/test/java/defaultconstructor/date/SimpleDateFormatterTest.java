package defaultconstructor.date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {

    @Test
    void testFormatDateString() {
        SimpleDate date = new SimpleDate();
        date.setDate(1900, 12, 31);
        SimpleDateFormatter formatter = new SimpleDateFormatter();
        assertEquals("1900-12-31", formatter.formatDateString(date));
        formatter.setDefaultCountryCode(CountryCode.US);
        assertEquals("12-31-1900", formatter.formatDateString(date));
        assertEquals("31-12-1900", formatter.formatDateString(date, CountryCode.EN));
    }
}
