package schoolrecords;

public class Subject {

    private final String subjectName;

    public Subject(String subjectName) {
        if (isEmpty(subjectName)) { throw new IllegalArgumentException("Subject name cannot be null or empty."); }
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    private boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }
}
