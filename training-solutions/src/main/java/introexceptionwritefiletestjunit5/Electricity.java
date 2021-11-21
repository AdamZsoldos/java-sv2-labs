package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    public List<String> getDailyOutages() {
        List<String> result = new ArrayList<>();
        result.add(LocalDate.now().toString() + ':');
        result.add("Első utca");
        result.add("Második utca");
        result.add("Harmadik utca");
        return result;
    }

    public void writeFile(Path path, List<String> lines) {
        try {
            Files.write(path, lines);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
