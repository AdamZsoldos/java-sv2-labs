package schoolrecords;

public final class Mark {

    private final MarkType markType;
    private final Subject subject;
    private final Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        this(MarkType.valueOf(markType), subject, tutor);
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "markType=" + markType +
                ", subject=" + subject.getSubjectName() +
                ", tutor=" + tutor.getName() +
                '}';
    }
}
