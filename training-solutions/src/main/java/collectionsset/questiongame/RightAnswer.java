package collectionsset.questiongame;

import java.util.Objects;

public class RightAnswer {

    private final String submitterName;

    public RightAnswer(String submitterName) {
        this.submitterName = submitterName;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RightAnswer that = (RightAnswer) o;
        return submitterName.equals(that.submitterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(submitterName);
    }
}
