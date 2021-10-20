package arrayofarrays;

import java.util.Arrays;

public class Triangular {

    public static void main(String[] args) {

        int[][] triangular = generateTriangularMatrix(10);
        ArrayOfArrays.printArrayOfArrays(triangular);
    }

    public static int[][] generateTriangularMatrix(int size) {
        int[][] a = new int[size][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            Arrays.fill(a[i], i);
        }
        return a;
    }
}
