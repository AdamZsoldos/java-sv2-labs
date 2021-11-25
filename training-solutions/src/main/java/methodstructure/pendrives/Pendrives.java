package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    private Pendrives() {
        throw new IllegalStateException("Utility class");
    }

    public static Pendrive getBest(List<Pendrive> pendrives) {
        Pendrive best = null;
        for (Pendrive pendrive : pendrives) {
            if (best == null || pendrive.comparePriceByCapacity(best) == -1) {
                best = pendrive;
            }
        }
        return best;
    }

    public static Pendrive getCheapest(List<Pendrive> pendrives) {
        Pendrive cheapest = null;
        for (Pendrive pendrive : pendrives) {
            if (cheapest == null || pendrive.isCheaperThan(cheapest)) {
                cheapest = pendrive;
            }
        }
        return cheapest;
    }

    public static void raisePriceAtCapacityBy(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive pendrive : pendrives) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.raisePriceBy(percent);
            }
        }
    }
}
