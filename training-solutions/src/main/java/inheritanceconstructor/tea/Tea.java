package inheritanceconstructor.tea;

public class Tea {

    private final String name;
    private final int price;

    public Tea(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
