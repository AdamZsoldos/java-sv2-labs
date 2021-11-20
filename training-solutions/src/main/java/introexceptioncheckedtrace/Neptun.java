package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    public static void main(String[] args) {
        Neptun neptun = new Neptun();
        try {
            List<String> lines = neptun.readLines();
            List<String> codes = neptun.getCodes(lines);
            System.out.println(codes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> readLines() throws IOException {
        return Files.readAllLines(Paths.get("files/neptun.csv"));
    }

    private List<String> getCodes(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            result.add(line.split(",")[1]);
        }
        return result;
    }
}
