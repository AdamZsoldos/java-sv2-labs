package clone.issuetracker;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IssueTest {

    Issue issue1 = new Issue(
            "Issue 0001",
            LocalDateTime.parse("2020-01-01T10:00"),
            Status.NEW,
            List.of(new Comment("Hello World!", LocalDateTime.parse("2020-01-01T10:05")))
    );

    @Test
    void testCreate() {
        assertEquals("Issue 0001", issue1.getName());
        assertEquals(LocalDateTime.parse("2020-01-01T10:00"), issue1.getTime());
        assertEquals(Status.NEW, issue1.getStatus());
        assertEquals(1, issue1.getComments().size());
        assertEquals("Hello World!", issue1.getComments().get(0).getText());
        assertEquals(LocalDateTime.parse("2020-01-01T10:05"), issue1.getComments().get(0).getTime());
    }

    @Test
    void testCloneWithoutComments() {
        Issue issue2 = new Issue(issue1, CopyMode.WITHOUT_COMMENTS);
        assertEquals("Issue 0001", issue2.getName());
        assertEquals(LocalDateTime.parse("2020-01-01T10:00"), issue2.getTime());
        assertEquals(Status.NEW, issue2.getStatus());
        assertEquals(0, issue2.getComments().size());
    }

    @Test
    void testCloneWithComments() {
        Issue issue2 = new Issue(issue1, CopyMode.WITH_COMMENTS);
        assertEquals("Issue 0001", issue2.getName());
        assertEquals(LocalDateTime.parse("2020-01-01T10:00"), issue2.getTime());
        assertEquals(Status.NEW, issue2.getStatus());
        assertEquals(1, issue2.getComments().size());
        assertEquals("Hello World!", issue2.getComments().get(0).getText());
        assertEquals(LocalDateTime.parse("2020-01-01T10:05"), issue2.getComments().get(0).getTime());
        issue2.getComments().get(0).setText("Hello Java!");
        assertEquals("Hello Java!", issue2.getComments().get(0).getText());
        assertEquals("Hello World!", issue1.getComments().get(0).getText());
    }
}
