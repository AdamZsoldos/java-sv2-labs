package interfaces.simpletasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTasksTest {

    SimpleTasks simpleTasks;

    @BeforeEach
    void setUp() {
        simpleTasks = new SimpleTasks(new ArrayList<>());
        simpleTasks.getTasks().add("do dishes");
        simpleTasks.getTasks().add("clean garage");
        simpleTasks.getTasks().add("do laundry");
    }

    @Test
    void testCreate() {
        assertEquals(3, simpleTasks.getTasks().size());
    }

    @Test
    void testRun() {
        simpleTasks.run();
        assertEquals(0, simpleTasks.getTasks().size());
    }
}
