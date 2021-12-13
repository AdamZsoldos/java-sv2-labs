package virtualmethod.grammar;

public class PhrasalVerb extends Verb implements Preposition {

    protected final String preposition;

    public PhrasalVerb(String preposition, String word) {
        super(word);
        this.preposition = preposition;
    }

    @Override
    public String getPreposition() {
        return preposition;
    }

    @Override
    public String getWholeWord() {
        return preposition + word;
    }
}
