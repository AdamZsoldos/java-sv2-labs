package collectionsmap.classtrip;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {

    private final Map<String, Integer> payments = new HashMap<>();

    public Map<String, Integer> getPayments() {
        return payments;
    }

    public void loadPayments(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                String[] parts = line.split(": ");
                payments.put(parts[0], Integer.parseInt(parts[1]));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }
}
