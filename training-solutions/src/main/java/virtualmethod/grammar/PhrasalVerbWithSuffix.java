package virtualmethod.grammar;

public class PhrasalVerbWithSuffix extends PhrasalVerb implements Suffix {

    private final String suffix;

    public PhrasalVerbWithSuffix(String preposition, String word, String suffix) {
        super(preposition, word);
        this.suffix = suffix;
    }

    @Override
    public String getSuffix() {
        return suffix;
    }

    @Override
    public String getWholeWord() {
        return super.getWholeWord() + suffix;
    }
}
