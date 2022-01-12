package collectionsiterator.xmas;

public class ChristmasPresent {

    private final String description;
    private final String recipient;
    private final int price;

    public ChristmasPresent(String description, String recipient, int price) {
        this.description = description;
        this.recipient = recipient;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipient() {
        return recipient;
    }

    public int getPrice() {
        return price;
    }
}
