package mathproblems;

public class DivisionMain {
    public static void main(String[] args) {

        System.out.println(Division.getDivisorsString(12));
        System.out.println(Division.getDivisorsString(-15));
        System.out.println(Division.getDivisorsString(0));

        System.out.println();
        System.out.println(Division.getDivisibleByIndexString(new int[] {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10}));
    }
}
