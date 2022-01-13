package sorting.webshop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Webshop {

    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getProductsSortedByName() {
        return getSortedProducts(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public List<Product> getProductsSortedByPrice() {
        return getSortedProducts(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    public List<Product> getProductsSortedByDate() {
        return getSortedProducts(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });
    }

    private List<Product> getSortedProducts(Comparator<Product> productComparator) {
        List<Product> result = new ArrayList<>(List.copyOf(products));
        result.sort(productComparator);
        return result;
    }
}
