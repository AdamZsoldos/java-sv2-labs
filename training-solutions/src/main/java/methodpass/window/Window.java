package methodpass.window;

public class Window {

    private final String roomName;
    private final int width;
    private int height;

    public Window(String roomName, int width, int height) {
        this.roomName = roomName;
        this.width = width;
        this.height = height;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
