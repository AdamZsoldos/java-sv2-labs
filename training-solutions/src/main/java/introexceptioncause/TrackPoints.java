package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    private TrackPoints() {
        throw new IllegalStateException("Utility class");
    }

    public static List<String> readCoordinates() {
        try {
            return Files.readAllLines(Paths.get("files/tracking.csv"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    public static List<Integer> getHeightData(List<String> coords) {
        List<Integer> result = new ArrayList<>();
        for (String coord : coords) {
            result.add(Integer.parseInt(coord.split(";")[2]));
        }
        return result;
    }

    public static void printHeightDifferences(List<Integer> heightData) {
        for (int i = 0; i < heightData.size() - 1; i++) {
            System.out.println(heightData.get(i + 1) - heightData.get(i));
        }
    }
}
