package methodchain;

public class Grasshopper {

    private int position = 0;

    public int getPosition() {
        return position;
    }

    public Grasshopper hopOnce(Direction direction) {
        switch (direction) {
            case NEGATIVE -> position--;
            case POSITIVE -> position++;
        }
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops(int negativeHopAt) {
        if (negativeHopAt < 1 || negativeHopAt > 5) {
            throw new IllegalArgumentException("Param must be between 1 and 5!");
        }
        for (int i = 1; i <= 5; i++) {
            if (i == negativeHopAt) {
                hopOnce(Direction.NEGATIVE);
            } else {
                hopOnce(Direction.POSITIVE);
            }
        }
    }
}
