package methodstructure.pendrives;

public class Pendrive {

    private final String name;
    private final int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void raisePriceBy(int percent) {
        price += (int) (price * percent / 100.0);
    }

    public int comparePriceByCapacity(Pendrive otherPendrive) {
        double current = getPricePerGB();
        double compared = otherPendrive.getPricePerGB();
        if (Math.abs(current - compared) < 0.05) {
            return 0;
        } else if (current > compared) {
            return 1;
        } else {
            return -1;
        }
    }

    private double getPricePerGB() {
        return (double) price / capacity;
    }

    public boolean isCheaperThan(Pendrive otherPendrive) {
        return price < otherPendrive.price;
    }

    @Override
    public String toString() {
        return "Pendrive: " + name + ", " + capacity + " GB, " + price + " Ft";
    }
}
