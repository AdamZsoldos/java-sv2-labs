package collectionsautoboxing.vote;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VoteTest {

    Vote vote = new Vote();
    Map<String, VoteResult> votes = new HashMap<>();

    @BeforeEach
    void setUp() {
        votes.put("John Doe", VoteResult.YES);
        votes.put("Jill Doe", VoteResult.NO);
        votes.put("Jane Doe", VoteResult.ABSTAIN);
        votes.put("Jack Doe", VoteResult.YES);
        votes.put("Josh Doe", VoteResult.YES);
        votes.put("Jess Doe", VoteResult.ABSTAIN);
        votes.put("Jeff Doe", VoteResult.NO);
    }

    @Test
    void testGetResult() {
        Map<VoteResult, Integer> expected = new HashMap<>();
        expected.put(VoteResult.YES, 3);
        expected.put(VoteResult.NO, 2);
        expected.put(VoteResult.ABSTAIN, 2);
        assertEquals(expected, vote.getResult(votes));
    }
}
