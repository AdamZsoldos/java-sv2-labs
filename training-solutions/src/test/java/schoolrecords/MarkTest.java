package schoolrecords;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MarkTest {

    Subject subject = new Subject("Mathematics");
    Tutor tutor = new Tutor("John Doe", List.of(subject));
    Mark mark1 = new Mark(MarkType.A, subject, tutor);
    Mark mark2 = new Mark("A", subject, tutor);

    @Test
    void testCreate() {
        assertSame(MarkType.A, mark1.getMarkType());
        assertSame(subject, mark1.getSubject());
        assertSame(tutor, mark1.getTutor());
    }
    @Test
    void testCreateWithString() {
        assertSame(MarkType.A, mark2.getMarkType());
        assertSame(subject, mark2.getSubject());
        assertSame(tutor, mark2.getTutor());
    }

    @Test
    void testTestToString() {
        assertEquals("Mark{markType=A, subject=Mathematics, tutor=John Doe}", mark1.toString());
    }
}
