package collectionsautoboxing.vote;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes) {
        Map<VoteResult, Integer> result = new HashMap<>();
        for (Map.Entry<String, VoteResult> vote : votes.entrySet()) {
            if (result.containsKey(vote.getValue())) {
                result.put(vote.getValue(), result.get(vote.getValue()) + 1);
            } else {
                result.put(vote.getValue(), 1);
            }
        }
        return result;
    }
}
