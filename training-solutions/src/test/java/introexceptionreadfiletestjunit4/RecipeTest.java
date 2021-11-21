package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RecipeTest {

    Recipe recipe = new Recipe();

    @Test
    public void testCreate() {
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    public void testAddIngredients() {
        recipe.addIngredients(Paths.get("src/test/resources/recipe.txt"));
        assertEquals(Arrays.asList("liszt", "margarin", "kristálycukor", "tojás", "citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj"),
                recipe.getIngredients());
    }

    @Test
    public void testAddIngredientsInvalidPath() {
        Path path = Paths.get("src/test/resources/recipenonexist.txt");
        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> recipe.addIngredients(path));
        assertEquals("Cannot read file", ise.getMessage());
    }
}
