package interfacerules.bill;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComplexBillWriterTest {

    @Test
    void testWriteBill() {
        List<String> billItems = new Bill().readBillItemsFromFile(Path.of("src/test/resources/billitems.txt"));
        String actual = new ComplexBillWriter().writeBill(billItems);
        String expected = """
                kenyér; darabszám: 1, egységár: 400, összesen: 400 Ft
                tej; darabszám: 2, egységár: 300, összesen: 600 Ft
                tejföl; darabszám: 2, egységár: 180, összesen: 360 Ft
                fogkefe; darabszám: 5, egységár: 200, összesen: 1000 Ft""";
        assertEquals(expected, actual);
    }
}
