package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {

        System.out.println(Conversion.convertDoubleToDouble(21.453));

        System.out.println(Arrays.toString(Conversion.convertIntArrayToByteArray(new int[] {5, -14, 6, 2, 125, 354, 9738, 3})));

        System.out.println(Conversion.getFirstDecimal(23.758));
        System.out.println(Conversion.getFirstDecimal(7.15825));
        System.out.println(Conversion.getFirstDecimal(3087.012356));
    }
}
