package array;

public class ArrayHandler {

    public static void main(String[] args) {

        int[] ints = {100, 200, 300, 400, 500, 600};
        String[] strings = {"apples", "bananas", "cranberries", "dates", "grapes"};

        addIndexToNumber(ints);
        concatenateIndexToString(strings);

        for (int i: ints) System.out.println(i);
        for (int i = 0; i < ints.length; i++) System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "\n"));
        System.out.println();

        for (String s: strings) System.out.println(s);
        for (int i = 0; i < strings.length; i++) System.out.print(strings[i] + (i < strings.length - 1 ? ", " : "\n"));
    }

    private static void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] += i;
        }
    }

    private static void concatenateIndexToString(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + ": " + source[i];
        }
    }
}
