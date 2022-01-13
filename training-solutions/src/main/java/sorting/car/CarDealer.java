package sorting.car;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {

    private final List<Car> carsForSale = new ArrayList<>();

    public List<Car> getCarsForSale() {
        return carsForSale;
    }

    public List<Car> getCarsForSaleSortedByPrice() {
        List<Car> result = new ArrayList<>(List.copyOf(carsForSale));
        result.sort(new CarPriceComparator());
        return result;
    }

    public List<Car> getCarsForSaleSortedByYearOfConstruction() {
        List<Car> result = new ArrayList<>(List.copyOf(carsForSale));
        result.sort(new CarYearOfConstructionComparator());
        return result;
    }
}
