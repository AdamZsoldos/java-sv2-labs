package exceptions.measurement;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    Measurement m = new Measurement();
    String path = "src/test/resources/measurementdata.csv";

    @Test
    void testReadFromFile() {
        List<String> lines = m.readFromFile(Path.of(path));
        assertEquals(11, lines.size());
    }

    @Test
    void testReadFromFileWithInvalidPath() {
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> m.readFromFile(Path.of(path + "_")));
        assertEquals("Cannot read file.", e.getMessage());
    }

    @Test
    void testValidate() {
        List<String> expected = List.of(
                "Line 2: invalid number of tokens.",
                "Line 3: noninteger serial number.",
                "Line 4: nonnumeric survey value.",
                "Line 5: invalid surveyor name.",
                "Line 8: noninteger serial number.",
                "Line 8: nonnumeric survey value.",
                "Line 9: nonnumeric survey value.",
                "Line 10: invalid number of tokens.",
                "Line 11: invalid number of tokens."
        );
        List<String> lines = m.readFromFile(Path.of(path));
        assertEquals(expected, m.validate(lines));
    }
}
