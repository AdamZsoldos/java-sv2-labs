package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {

    private Books() {
        throw new IllegalStateException("Utility class");
    }

    public static List<String> getLinesReadable(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            String[] parts;
            for (int i = 0; i < lines.size(); i++) {
                parts = lines.get(i).split(";");
                lines.set(i, parts[2] + ": " + parts[1]);
            }
            return lines;
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void writeFile(Path path, List<String> lines) {
        try {
            Files.write(path, lines);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
