package arrayofarrays;

public class DailyValues {

    public static void main(String[] args) {

        int[][] values = getValues();
        ArrayOfArrays.printArrayOfArrays(values);
    }

    public static int[][] getValues() {
        int[][] a = new int[12][];
        for (int i = 0; i < a.length; i++) {
            int noDays = switch (i) {
                case 1 -> 28;
                case 3, 5, 8, 10 -> 30;
                default -> 31;
            };
            a[i] = new int[noDays];
        }
        return a;
    }
}
