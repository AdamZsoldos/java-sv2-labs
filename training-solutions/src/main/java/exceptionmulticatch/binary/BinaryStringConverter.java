package exceptionmulticatch.binary;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String binaryString) {
        if (binaryString == null) { throw new NullPointerException("Binary string is null"); }
        if (binaryString.isBlank()) { throw new IllegalArgumentException("Binary string is blank"); }
        boolean[] result = new boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            result[i] = charToBoolean(binaryString.charAt(i));
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] booleanArray) {
        if (booleanArray == null) { throw new NullPointerException("Binary array is null"); }
        if (booleanArray.length == 0) { throw new IllegalArgumentException("Binary array is empty"); }
        char[] result = new char[booleanArray.length];
        for (int i = 0; i < booleanArray.length; i++) {
            result[i] = booleanToChar(booleanArray[i]);
        }
        return new String(result);
    }

    private boolean charToBoolean(char c) {
        switch (c) {
            case '0': return false;
            case '1': return true;
        }
        throw new IllegalArgumentException("Invalid binary string");
    }

    private char booleanToChar(boolean b) {
        return b ? '1' : '0';
    }
}
