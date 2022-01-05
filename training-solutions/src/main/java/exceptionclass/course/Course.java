package exceptionclass.course;

public final class Course {

    private final String name;
    private final SimpleTime start;

    public Course(String name, SimpleTime start) {
        this.name = name;
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getStart() {
        return start;
    }

    @Override
    public String toString() {
        return start + ": " + name;
    }
}
