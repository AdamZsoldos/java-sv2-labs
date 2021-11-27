package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SeparatedSum {

    private SeparatedSum() {
        throw new IllegalStateException("Utility class");
    }

    public static Sum sum(String floatingNumbers) {
        String[] strings = floatingNumbers.replace(",", ".").split(";");
        double negativeSum = 0;
        double positiveSum = 0;
        for (String string : strings) {
            double number = Double.parseDouble(string);
            if (number < 0) negativeSum += number;
            else positiveSum += number;
        }
        return new Sum(negativeSum, positiveSum);
    }

    public static Sum sumFromFile(Path path) {
        try {
            return sum(Files.readAllLines(path).get(0));
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file!", e);
        }
    }
}
