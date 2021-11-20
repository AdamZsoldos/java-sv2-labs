package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Holiday {

    public static void main(String[] args) {
        try {
            System.out.println(Files.readAllLines(Paths.get("files/holiday.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
