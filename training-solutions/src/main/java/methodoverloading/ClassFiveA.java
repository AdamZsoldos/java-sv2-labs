package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

    private final List<String> names = Arrays.asList("John", "Jane", "Jill");

    public String getTodayReferringStudent(int number) {
        return names.get(number - 1);
    }

    public String getTodayReferringStudent(Number number) {
        return names.get(number.getValue() - 1);
    }

    public String getTodayReferringStudent(String numberName) {
        return names.get(Number.valueOf(numberName.toUpperCase()).getValue() - 1);
    }
}
