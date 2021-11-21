package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe recipe = new Recipe();

    @Test
    void testCreate() {
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    void testAddIngredients() {
        recipe.addIngredients(Paths.get("src/test/resources/recipe.txt"));
        assertEquals(Arrays.asList("liszt", "margarin", "kristálycukor", "tojás", "citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj"),
                recipe.getIngredients());
    }

    @Test
    void testAddIngredientsInvalidPath() {
        Path path = Paths.get("src/test/resources/recipenonexist.txt");
        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> recipe.addIngredients(path));
        assertEquals("Cannot read file", ise.getMessage());
    }
}
