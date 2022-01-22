package streams.cookbook;

import java.util.List;

public class Cake {

    private final String name;
    private final List<String> ingredients;

    public Cake(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
