package collectionsmap.casting;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int next = Integer.MAX_VALUE;
        for (int number : applicants.keySet()) {
            if (number > lastNumber && number < next) {
                next = number;
            }
        }
        if (next < Integer.MAX_VALUE) {
            return applicants.get(next);
        }
        throw new IllegalStateException("No more applicants");
    }
}
