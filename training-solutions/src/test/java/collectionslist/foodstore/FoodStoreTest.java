package collectionslist.foodstore;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FoodStoreTest {

    FoodStore store = new FoodStore();
    Food f1 = new Food("Apple", LocalDate.now().plusMonths(1));
    Food f2 = new Food("Bread", LocalDate.now().plusDays(1));
    Food f3 = new Food("Milk", LocalDate.now());

    @Test
    void testCreate() {
        assertEquals(0, store.getFoodItems().size());
    }

    @Test
    void testAddFoodItem() {
        store.addFoodItem(f1);
        store.addFoodItem(f2);
        store.addFoodItem(f3);
        assertEquals(List.of(f1, f2, f3), store.getFoodItems());
    }

    @Test
    void testSellFirst() {
        store.sellFirst(f1);
        store.sellFirst(f2);
        store.sellFirst(f3);
        assertEquals(List.of(f3, f1, f2), store.getFoodItems());
    }
}
