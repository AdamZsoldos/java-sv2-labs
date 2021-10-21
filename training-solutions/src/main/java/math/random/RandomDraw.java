package math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {

        List<String> participants = Arrays.asList("John", "Jack", "Jill", "Jimmy", "Jess", "Jon", "Joe", "Jane", "Jade", "Jen");
        System.out.println("Raffle participants: " + participants + " (" + participants.size() + ")");

        Random random = new Random();
        System.out.println("Winner 1: " + participants.get(random.nextInt(0, 5)));
        System.out.println("Winner 2: " + participants.get(random.nextInt(5, 10)));
        System.out.println("Congratulations to our winners!");
    }
}
