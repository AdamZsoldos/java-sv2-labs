package optional.bucketlist;

public class Destination {

    private final String name;
    private final String description;
    private final int kmFromHome;

    public Destination(String name, String description, int kmFromHome) {
        this.name = name;
        this.description = description;
        this.kmFromHome = kmFromHome;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getKmFromHome() {
        return kmFromHome;
    }
}
