package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Favorites {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> categories = Arrays.asList("film", "song", "food", "color");
        List<String> favouriteThings = new ArrayList<>();

        for (String category: categories) {
            System.out.println("What is your favorite " + category + "?");
            favouriteThings.add(scanner.nextLine());
        }

        for (int i = 0; i < favouriteThings.size(); i++) {
            System.out.println("Your favorite " + categories.get(i) + " is " + favouriteThings.get(i) + ".");
        }

        System.out.println("You shared " + favouriteThings.size() + " of your favorite things.");
    }
}
