package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {

    public static void main(String[] args) {
        for (String line : new Poem().readPoem()) {
            System.out.print(line.charAt(0));
        }
    }

    private List<String> readPoem() {
        try {
            return Files.readAllLines(Paths.get("files/poem.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }
}
