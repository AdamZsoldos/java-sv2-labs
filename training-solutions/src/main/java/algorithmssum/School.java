package algorithmssum;

import java.util.List;

public class School {

    public int getNumberOfStudents(List<Integer> headcounts) {
        int sum = 0;
        for (Integer i : headcounts) {
            sum += i;
        }
        return sum;
    }
}
