package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {
        List<String> roadMap = Arrays.asList("Budapest", "Székesfehérvár", "Siófok", "Nagykanizsa");
        try {
            Files.write(Paths.get("files/roadmap.txt"), roadMap);
        } catch (IOException ioe) {
            System.out.println("Cannot write file");
            ioe.printStackTrace();
        }
    }
}
