package clone.timesheet;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeSheetItemTest {

    TimeSheetItem item1 = new TimeSheetItem("John Doe", "Project A", LocalDateTime.parse("2020-01-01T10:00"), LocalDateTime.parse("2020-01-01T12:00"));

    @Test
    void testCreate() {
        assertEquals("John Doe", item1.getEmployee());
        assertEquals("Project A", item1.getProject());
        assertEquals(LocalDateTime.parse("2020-01-01T10:00"), item1.getFrom());
        assertEquals(LocalDateTime.parse("2020-01-01T12:00"), item1.getTo());
    }

    @Test
    void testCreateCopy() {
        TimeSheetItem item2 = new TimeSheetItem(item1);
        assertEquals("John Doe", item2.getEmployee());
        assertEquals("Project A", item2.getProject());
        assertEquals(LocalDateTime.parse("2020-01-01T10:00"), item2.getFrom());
        assertEquals(LocalDateTime.parse("2020-01-01T12:00"), item2.getTo());
    }

    @Test
    void testCopyWithDifferentEmployee() {
        TimeSheetItem item2 = TimeSheetItem.copyWithDifferentEmployee(item1, "Jill Doe");
        assertEquals("Jill Doe", item2.getEmployee());
        assertEquals("Project A", item2.getProject());
        assertEquals(LocalDateTime.parse("2020-01-01T10:00"), item2.getFrom());
        assertEquals(LocalDateTime.parse("2020-01-01T12:00"), item2.getTo());
    }
}
