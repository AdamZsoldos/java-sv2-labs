package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    private Temperature() {
        throw new IllegalStateException("Utility class");
    }

    public static int getMin(List<Integer> temperatureList) {
        int min = Integer.MAX_VALUE;
        for (int temperature : temperatureList) {
            if (temperature < min) min = temperature;
        }
        return min;
    }
}
