package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {

    public static final List<String> DAYS = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

    public static void main(String[] args) {

        System.out.println(DAYS);

        DAYS.set(1, DAYS.get(2));
        System.out.println(DAYS);
    }
}
