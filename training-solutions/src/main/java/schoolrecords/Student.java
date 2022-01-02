package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private final List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (isEmpty(name)) { throw new IllegalArgumentException("Name cannot be null or empty."); }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grade(Mark mark) {
        if (mark == null) { throw new IllegalArgumentException("Mark cannot be null."); }
        marks.add(mark);
    }

    public double calculateAverage() {
        int total = 0;
        int sum = 0;
        for (Mark mark : marks) {
            sum += mark.getMarkType().getNumericValue();
            total++;
        }
        if (total == 0) { throw new ArithmeticException("Cannot calculate average from zero grade marks."); }
        return (double) sum / total;
    }

    public double calculateSubjectAverage(Subject subject) {
        if (subject == null) { throw new NullPointerException("Subject cannot be null."); }
        int total = 0;
        int sum = 0;
        for (Mark mark : marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sum += mark.getMarkType().getNumericValue();
                total++;
            }
        }
        if (total == 0) { throw new ArithmeticException("Cannot calculate average from zero grade marks."); }
        return (double) sum / total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    private boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }
}
