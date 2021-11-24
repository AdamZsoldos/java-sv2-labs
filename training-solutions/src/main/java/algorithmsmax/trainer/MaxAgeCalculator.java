package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    private MaxAgeCalculator() {
        throw new IllegalStateException("Utility class");
    }

    public static Trainer getOldestTrainer(List<Trainer> trainers) {
        Trainer oldest = null;
        for (Trainer trainer : trainers) {
            if (oldest == null || trainer.getAge() > oldest.getAge()) oldest = trainer;
        }
        return oldest;
    }
}
