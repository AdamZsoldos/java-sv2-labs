package collectionsset.questiongame;

import java.util.*;

public class QuestionGame {

    private static final int NUMBER_OF_WINNERS = 5;
    private final List<RightAnswer> rightAnswers = new ArrayList<>();
    private final Random random = new Random();

    public List<RightAnswer> getRightAnswers() {
        return rightAnswers;
    }

    public Set<String> drawWinners() {
        Set<String> winners = new TreeSet<>();

        while (winners.size() < NUMBER_OF_WINNERS && !rightAnswers.isEmpty()) {
            int i = random.nextInt(rightAnswers.size());
            winners.add(rightAnswers.get(i).getSubmitterName());
            rightAnswers.remove(i);
        }

        if (winners.size() >= NUMBER_OF_WINNERS) {
            return winners;
        }
        throw new IllegalStateException("Not enough right answers");
    }
}
