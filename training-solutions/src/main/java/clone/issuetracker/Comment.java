package clone.issuetracker;

import java.time.LocalDateTime;

public class Comment {

    private String text;
    private final LocalDateTime time;

    public Comment(String text, LocalDateTime time) {
        this.text = text;
        this.time = time;
    }

    public Comment(Comment comment) {
        this(comment.text, comment.time);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
