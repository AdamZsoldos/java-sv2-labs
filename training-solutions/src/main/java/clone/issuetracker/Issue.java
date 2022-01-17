package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {

    private final String name;
    private final LocalDateTime time;
    private final Status status;
    private final List<Comment> comments;

    public Issue(String name, LocalDateTime time, Status status, List<Comment> comments) {
        this.name = name;
        this.time = time;
        this.status = status;
        this.comments = comments;
    }

    public Issue(Issue issue, CopyMode copyMode) {
        this.name = issue.name;
        this.time = issue.time;
        this.status = issue.status;
        this.comments = new ArrayList<>();
        if (copyMode == CopyMode.WITH_COMMENTS) {
            for (Comment comment : issue.comments) {
                this.comments.add(new Comment(comment));
            }
        }
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
