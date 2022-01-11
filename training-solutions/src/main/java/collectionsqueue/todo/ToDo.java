package collectionsqueue.todo;

public class ToDo {

    private final String description;
    private final boolean isUrgent;

    public ToDo(String description, boolean isUrgent) {
        this.description = description;
        this.isUrgent = isUrgent;
    }

    public String getDescription() {
        return description;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    @Override
    public String toString() {
        return description + (isUrgent ? " (urgent!)" : "");
    }
}
