package schoolrecords;

public class StudyResultByName {

    private final String studentName;
    private final double gradeAverage;

    public StudyResultByName(String studentName, double gradeAverage) {
        if (isEmpty(studentName)) { throw new IllegalArgumentException("Student name cannot be null or empty."); }
        this.studentName = studentName;
        this.gradeAverage = gradeAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    private boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }

    @Override
    public String toString() {
        return "StudyResultByName{" +
                "studentName='" + studentName + '\'' +
                ", gradeAverage=" + gradeAverage +
                '}';
    }
}
