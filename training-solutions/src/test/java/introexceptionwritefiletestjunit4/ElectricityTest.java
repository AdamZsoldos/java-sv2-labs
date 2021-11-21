package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ElectricityTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testWriteFile() throws IOException {
        Path path = tempFolder.newFile("outages.txt").toPath();
        Electricity electricity = new Electricity();
        electricity.writeFile(path, electricity.getDailyOutages());
        List<String> lines = Files.readAllLines(path);
        assertEquals(Arrays.asList(LocalDate.now().toString() + ':', "Első utca", "Második utca", "Harmadik utca"), lines);
    }
}
