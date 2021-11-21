package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Names {

    public static void main(String[] args) {
        Names names = new Names();
        names.printFirstNameWithPrefix(Paths.get("files/names.txt"), "dr.");
        names.printFirstNameWithPrefix(Paths.get("files/nameswithout.txt"), "dr.");
        names.printFirstNameWithPrefix(Paths.get("files/names_.txt"), "dr.");
    }

    private void printFirstNameWithPrefix(Path path, String prefix) {
        try {
            for (String name : Files.readAllLines(path)) {
                if (name.startsWith(prefix)) {
                    System.out.println(name);
                    return;
                }
            }
            System.out.println();
        } catch (IOException ioe) {
            System.out.println("Cannot read file.");
        } finally {
            System.out.println("End of reading.");
        }
    }
}
