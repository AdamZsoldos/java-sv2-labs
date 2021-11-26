package methodpass.window;

import java.util.List;

public class WindowOperation {

    private WindowOperation() {
        throw new IllegalStateException("Utility class");
    }

    public static void increaseHeight(List<Window> windows, int plusHeight) {
        for (Window window : windows) {
            window.setHeight(window.getHeight() + plusHeight);
        }
    }
}
