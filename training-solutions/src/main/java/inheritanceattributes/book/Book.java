package inheritanceattributes.book;

public class Book {

    private final String title;
    protected final int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getCost(int orderAmount) {
        return orderAmount * price;
    }
}
