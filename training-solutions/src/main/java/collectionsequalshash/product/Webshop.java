package collectionsequalshash.product;

import java.util.ArrayList;
import java.util.List;

public class Webshop {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public int countProduct(Product product) {
        int total = 0;
        for (Product product1 : products) {
            if (product1.equals(product)) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Webshop webshop = new Webshop();
        webshop.getProducts().add(new Product("Apple", "0000"));
        webshop.getProducts().add(new Product("Pear", "1111"));
        webshop.getProducts().add(new Product("Orange", "0000"));
        webshop.getProducts().add(new Product("Satsuma", "0000"));
        webshop.getProducts().add(new Product("Banana", "1111"));
        System.out.println(webshop.countProduct(new Product("Pineapple", "0000")));
        System.out.println(webshop.countProduct(new Product("Coconut", "1111")));
        System.out.println(webshop.countProduct(new Product("Apple", "2222")));
    }
}
