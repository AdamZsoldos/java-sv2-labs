package interfacerules.bill;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBillWriterTest {

    @Test
    void testWriteBill() {
        List<String> billItems = new Bill().readBillItemsFromFile(Path.of("src/test/resources/billitems.txt"));
        String actual = new SimpleBillWriter().writeBill(billItems);
        String expected = """
                kenyér, 1 * 400 = 400 Ft
                tej, 2 * 300 = 600 Ft
                tejföl, 2 * 180 = 360 Ft
                fogkefe, 5 * 200 = 1000 Ft""";
        assertEquals(expected, actual);
    }
}
