package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private final int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public List<String> getAidPerCapitaBySettlement(Path path) {
        List<String> result = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                result.add(convertLine(line));
            }
        } catch (IOException | NullPointerException | NumberFormatException | IndexOutOfBoundsException | ArithmeticException e) {
            throw new IllegalArgumentException("Invalid operation", e);
        }
        return result;
    }

    private String convertLine(String line) {
        String[] parts = line.split(": ");
        int aidPerCapita = amount / Integer.parseInt(parts[1]);
        return parts[0] + ": " + aidPerCapita;
    }
}
