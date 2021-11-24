package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public static Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespeople) {
        Salesperson selected = null;
        for (Salesperson salesperson : salespeople) {
            if (selected == null || salesperson.getAmount() > selected.getAmount()) {
                selected = salesperson;
            }
        }
        return selected;
    }

    public static Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespeople) {
        Salesperson selected = null;
        for (Salesperson salesperson : salespeople) {
            if (selected == null || salesperson.getAmountOverTarget() > selected.getAmountOverTarget()) {
                selected = salesperson;
            }
        }
        return selected;
    }

    public static Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespeople) {
        Salesperson selected = null;
        for (Salesperson salesperson : salespeople) {
            if (selected == null || salesperson.getAmountOverTarget() < selected.getAmountOverTarget()) {
                selected = salesperson;
            }
        }
        return selected;
    }
}
