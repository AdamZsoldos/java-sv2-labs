package optional.course;

public class Course {

    private final String name;
    private final int price;
    private final Level level;

    public Course(String name, int price, Level level) {
        this.name = name;
        this.price = price;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Level getLevel() {
        return level;
    }
}
