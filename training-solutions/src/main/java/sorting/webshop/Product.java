package sorting.webshop;

import java.time.LocalDateTime;

public class Product {

    private final String name;
    private final int price;
    private final LocalDateTime from;

    public Product(String name, int price, LocalDateTime from) {
        this.name = name;
        this.price = price;
        this.from = from;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getFrom() {
        return from;
    }
}
