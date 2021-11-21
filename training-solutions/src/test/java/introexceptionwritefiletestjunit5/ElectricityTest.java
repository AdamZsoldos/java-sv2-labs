package introexceptionwritefiletestjunit5;

import introexceptionwritefiletestjunit4.Electricity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    @TempDir
    File tempDir;

    @Test
    void testWriteFile() throws IOException {
        Path path = tempDir.toPath().resolve("outages.txt");
        introexceptionwritefiletestjunit4.Electricity electricity = new Electricity();
        electricity.writeFile(path, electricity.getDailyOutages());
        List<String> lines = Files.readAllLines(path);
        assertEquals(Arrays.asList(LocalDate.now().toString() + ':', "Első utca", "Második utca", "Harmadik utca"), lines);
    }
}
