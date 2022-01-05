package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file.", e);
        }
    }

    public List<String> validate(List<String> lines) {
        List<String> errors = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(",");
            if (!isNumberOfTokensValid(parts)) {
                errors.add(String.format("Line %d: invalid number of tokens.", i + 1));
                continue;
            }
            if (!isValidInt(parts[0])) {
                errors.add(String.format("Line %d: noninteger serial number.", i + 1));
            }
            if (!isValidNumber(parts[1])) {
                errors.add(String.format("Line %d: nonnumeric survey value.", i + 1));
            }
            if (!isValidName(parts[2])) {
                errors.add(String.format("Line %d: invalid surveyor name.", i + 1));
            }
        }
        return errors;
    }

    private boolean isNumberOfTokensValid(String[] parts) {
        return parts.length == 3;
    }

    private boolean isValidInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isValidNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isValidName(String s) {
        return s.trim().contains(" ");
    }
}
