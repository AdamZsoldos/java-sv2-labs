package methodpass.window;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    @Test
    void testIncreaseHeight() {
        List<Window> windows = Arrays.asList(
                new Window("kitchen", 50, 70),
                new Window("living room", 120, 80),
                new Window("toilet", 30, 45)
        );
        WindowOperation.increaseHeight(windows, 20);
        assertEquals(90, windows.get(0).getHeight());
        assertEquals(100, windows.get(1).getHeight());
        assertEquals(65, windows.get(2).getHeight());
    }
}
