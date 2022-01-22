package streams.cookbook;

import java.util.ArrayList;
import java.util.List;

public class CookBook {

    private final List<Cake> cakes = new ArrayList<>();

    public List<Cake> getCakes() {
        return cakes;
    }

    public List<String> listCakeNamesWithIngredient(String ingredient) {
        return cakes.stream()
                .filter(cake -> cake.getIngredients().contains(ingredient))
                .map(Cake::getName)
                .toList();
    }

    public List<String> listCakeNamesWithMaxIngredients(int max) {
        return cakes.stream()
                .filter(cake -> cake.getIngredients().size() <= max)
                .map(Cake::getName)
                .toList();
    }
}
