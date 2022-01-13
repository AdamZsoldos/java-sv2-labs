package sorting.car;

import java.util.Comparator;

public class CarYearOfConstructionComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYearOfConstruction() - o2.getYearOfConstruction();
    }
}
