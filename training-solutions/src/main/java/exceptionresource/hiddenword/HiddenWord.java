package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            return parseHiddenWord(scanner);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }

    private String parseHiddenWord(Scanner scanner) {
        StringBuilder word = new StringBuilder();
        while (scanner.hasNextLine()) {
            word.append(getHiddenChar(scanner.nextLine()));
        }
        return word.toString();
    }

    private char getHiddenChar(String line) {
        for (char c : line.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                return c;
            }
        }
        return ' ';
    }
}
