package typeconversion;

public class Conversion {

    private Conversion() {
        throw new IllegalStateException("Utility class");
    }

    public static double convertDoubleToDouble(double d) {
        return (int) d;
    }

    public static byte[] convertIntArrayToByteArray(int[] ints) {
        byte[] bytes = new byte[ints.length];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] >= 0 && ints[i] <= 127) bytes[i] = (byte) ints[i];
            else bytes[i] = -1;
        }
        return bytes;
    }

    public static int getFirstDecimal(double d) {
        return (int) (10 * (d - (int) d));
    }
}
