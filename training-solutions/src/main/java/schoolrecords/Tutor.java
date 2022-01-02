package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private final String name;
    private final List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> taughtSubjects) {
        if (isEmpty(name)) { throw new IllegalArgumentException("Name cannot be null or empty."); }
        if (isEmpty(taughtSubjects)) { throw new IllegalArgumentException("Taught subjects cannot be null or empty."); }
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean isTeachingSubject(Subject subject) {
        return taughtSubjects.contains(subject);
    }

    private boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }

    private boolean isEmpty(List list) {
        return list == null || list.isEmpty();
    }
}
