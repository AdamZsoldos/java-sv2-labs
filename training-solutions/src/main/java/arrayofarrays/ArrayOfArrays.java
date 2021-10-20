package arrayofarrays;

public class ArrayOfArrays {

    public static void main(String[] args) {

        int[][] numbers = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        printArrayOfArrays(numbers);
    }

    public static void printArrayOfArrays(int[][] a) {
        for (int[] b : a) {
            for (int i : b) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
