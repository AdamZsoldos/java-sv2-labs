package polymorphism.river;

import java.util.List;

public class Danube extends River {

    private final List<String> capitals;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {
        Water water = new Danube("Danube", 2850, List.of("Vienna", "Bratislava", "Budapest", "Belgrade"));
        River river = (River) water;
        Danube danube = (Danube) river;
        System.out.println(water.getClass());
        System.out.println(river.getName());
        System.out.println(river.getLength());
        System.out.println(danube.getCapitals());
    }
}
