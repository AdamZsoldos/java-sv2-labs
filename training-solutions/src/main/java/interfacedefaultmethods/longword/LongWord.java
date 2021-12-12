package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {

    @Override
    public String getLongWord(Path path) {
        List<String> lines = readFromFile(path);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lines.size() - 1; i++) {
            result.append(lines.get(i).charAt(0));
        }
        result.append(lines.get(lines.size() - 1));
        return result.toString();
    }
}
