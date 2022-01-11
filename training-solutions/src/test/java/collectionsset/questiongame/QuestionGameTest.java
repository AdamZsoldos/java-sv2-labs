package collectionsset.questiongame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class QuestionGameTest {

    QuestionGame game = new QuestionGame();

    @BeforeEach
    void setUp() {
        for (int i = 0; i < 5; i++) {
            game.getRightAnswers().add(new RightAnswer("John"));
        }
        for (int i = 0; i < 10; i++) {
            game.getRightAnswers().add(new RightAnswer("Jack"));
        }
        for (int i = 0; i < 8; i++) {
            game.getRightAnswers().add(new RightAnswer("Jane"));
        }
        for (int i = 0; i < 12; i++) {
            game.getRightAnswers().add(new RightAnswer("Jill"));
        }
        for (int i = 0; i < 4; i++) {
            game.getRightAnswers().add(new RightAnswer("Jess"));
        }
        for (int i = 0; i < 6; i++) {
            game.getRightAnswers().add(new RightAnswer("Jim"));
        }
    }

    @RepeatedTest(20)
    void testDrawWinners() {
        Set<String> winners = game.drawWinners();
        System.out.println(winners);
        assertEquals(5, winners.size());
    }

    @Test
    void testDrawWinnersNotEnoughRightAnswers() {
        assertThrows(IllegalStateException.class, () -> drawNTimes(8), "Not enough right answers");
    }

    void drawNTimes(int n) {
        for (int i = 0; i < n; i++) {
            game.drawWinners();
        }
    }
}
