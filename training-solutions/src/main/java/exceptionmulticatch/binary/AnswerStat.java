package exceptionmulticatch.binary;

public class AnswerStat {

    private final BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter converter) {
        this.converter = converter;
    }

    public boolean[] convert(String binaryString) {
        try {
            return converter.binaryStringToBooleanArray(binaryString);
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new InvalidBinaryStringException(e);
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] booleanArray = convert(answers);
        int numTrue = countTrue(booleanArray);
        return (int) (numTrue * 100.0 / booleanArray.length);
    }

    private int countTrue(boolean[] booleanArray) {
        int total = 0;
        for (boolean b : booleanArray) {
            if (b) {
                total++;
            }
        }
        return total;
    }
}
