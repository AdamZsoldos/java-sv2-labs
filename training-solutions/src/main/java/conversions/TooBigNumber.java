package conversions;

public class TooBigNumber {

    public static void main(String[] args) {
        TooBigNumber tbn = new TooBigNumber();
        System.out.println(tbn.getRightResult(1000));
    }

    public long getRightResult(int number) {
        return 2_147_483_647 + (long) number;
    }
}
