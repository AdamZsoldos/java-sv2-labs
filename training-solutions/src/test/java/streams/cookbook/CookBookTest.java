package streams.cookbook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CookBookTest {

    CookBook cookBook = new CookBook();

    @BeforeEach
    void setUp() {
        cookBook.getCakes().add(new Cake("Muffin", List.of("Sugar", "Flour", "Eggs")));
        cookBook.getCakes().add(new Cake("Egg cake", List.of("Sugar", "Eggs")));
        cookBook.getCakes().add(new Cake("Diet cake", List.of("Flour", "Eggs")));
    }

    @Test
    void testListCakeNamesWithIngredient() {
        assertEquals(List.of("Muffin", "Diet cake"), cookBook.listCakeNamesWithIngredient("Flour"));
    }

    @Test
    void testListCakeNamesWithMaxIngredients() {
        assertEquals(List.of("Egg cake", "Diet cake"), cookBook.listCakeNamesWithMaxIngredients(2));
    }
}
