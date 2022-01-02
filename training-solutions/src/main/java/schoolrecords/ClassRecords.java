package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private final String className;
    private final Random random;
    private final List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        if (isEmpty(className)) { throw new IllegalArgumentException("Class name cannot be null or empty."); }
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student) {
        if (students.contains(student)) { return false; }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        if (!students.contains(student)) { return false; }
        students.remove(student);
        return true;
    }

    public double calculateClassAverage() {
        int total = 0;
        double sum = 0;
        for (Student student : students) {
            try {
                sum += student.calculateAverage();
                total++;
            } catch (ArithmeticException e) {
                // Ignore if student doesn't have grade average.
            }
        }
        if (total == 0) { throw new ArithmeticException("Cannot calculate class average from zero student averages."); }
        return sum / total;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        int total = 0;
        double sum = 0;
        for (Student student : students) {
            try {
                sum += student.calculateSubjectAverage(subject);
                total++;
            } catch (ArithmeticException e) {
                // Ignore if student doesn't have grade average in subject.
            }
        }
        if (total == 0) { throw new ArithmeticException("Cannot calculate class average from zero student averages."); }
        return sum / total;
    }

    public Student findStudentByName(String name) {
        if (isEmpty(name)) { throw new IllegalArgumentException("Name cannot be null or empty."); }
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student not found.");
    }

    public Student selectRandomStudent() {
        if (students.isEmpty()) { throw new IllegalStateException("Students list is empty."); }
        return students.get(random.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> result = new ArrayList<>();
        for (Student student : students) {
            try {
                result.add(new StudyResultByName(student.getName(), student.calculateAverage()));
            } catch (ArithmeticException e) {
                // Skip student.
            }
        }
        return result;
    }

    public String listStudentNames() {
        StringBuilder result = new StringBuilder();
        for (Student student : students) {
            if (!result.isEmpty()) { result.append(", "); }
            result.append(student.getName());
        }
        return result.toString();
    }

    private boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }
}
