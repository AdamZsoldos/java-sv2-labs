package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {

    public static void main(String[] args) {
        PaulStreetBoys pst = new PaulStreetBoys();
        pst.printNames(pst.readNames());
    }

    private List<String> readNames() {
        try {
            return Files.readAllLines(Paths.get("files/palutcaifiuk.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    private void printNames(List<String> names) {
        for (String name : names) {
            if (name.startsWith("Nemecsek")) name = name.toLowerCase();
            System.out.println(name);
        }
    }
}
