package introexceptionthrowjunit4;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final List<Integer> grades = new ArrayList<>();

    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        if (grade < 1 || grade > 5) {
            throw new IllegalArgumentException("Grade must be between 1 and 5!");
        }
        grades.add(grade);
    }
}
