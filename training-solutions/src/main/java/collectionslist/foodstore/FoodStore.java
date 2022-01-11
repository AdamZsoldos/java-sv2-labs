package collectionslist.foodstore;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {

    private final List<Food> foodItems = new LinkedList<>();

    public List<Food> getFoodItems() {
        return foodItems;
    }

    public void addFoodItem(Food foodItem) {
        foodItems.add(foodItem);
    }

    public void sellFirst(Food foodItem) {
        if (foodItem.getExpirationDate().equals(LocalDate.now())) {
            foodItems.add(0, foodItem);
        } else {
            foodItems.add(foodItem);
        }
    }
}
