package classstructureintegrate;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice(int price) {
        if (price <= 0) return;
        this.price += price;
    }

    public void decreasePrice(int price) {
        if (price <= 0) return;
        if (this.price >= price) this.price -= price;
        else this.price = 0;
    }
}
