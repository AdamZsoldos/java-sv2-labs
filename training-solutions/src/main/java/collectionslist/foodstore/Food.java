package collectionslist.foodstore;

import java.time.LocalDate;

public class Food {

    private final String name;
    private final LocalDate expirationDate;

    public Food(String name, LocalDate expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
