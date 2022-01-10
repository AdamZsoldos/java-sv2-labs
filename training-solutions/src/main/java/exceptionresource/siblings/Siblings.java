package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Siblings {

    public List<String> getFullNames(String lastName, Path path) {
        try {
            List<String> names = Files.readAllLines(path);
            for (int i = 0; i < names.size(); i++) {
                names.set(i, lastName + ' ' + names.get(i));
            }
            return names;
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }
}
