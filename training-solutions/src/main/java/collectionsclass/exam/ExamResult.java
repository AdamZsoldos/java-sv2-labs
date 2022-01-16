package collectionsclass.exam;

import java.util.Objects;

public class ExamResult implements Comparable<ExamResult> {

    private final String applicantName;
    private final int points;

    public ExamResult(String applicantName, int points) {
        this.applicantName = applicantName;
        this.points = points;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public int compareTo(ExamResult o) {
        return points - o.points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResult that = (ExamResult) o;
        return points == that.points;
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
