package arrayofarrays;

import java.util.Arrays;

public class Rectangle {

    public static void main(String[] args) {

        int[][] rectangular = generateRectangularMatrix(10);
        ArrayOfArrays.printArrayOfArrays(rectangular);
    }

    public static int[][] generateRectangularMatrix(int size) {
        int[][] a = new int[size][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[size];
            Arrays.fill(a[i], i);
        }
        return a;
    }
}
