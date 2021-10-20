package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("weekDays[1]: " + weekDays[1]);
        System.out.println("weekDays.length: " + weekDays.length);

        int[] powersOfTwo = new int[5];
        System.out.print("powersOfTwo: {");
        for (int i = 0; i < powersOfTwo.length; i++) {
            powersOfTwo[i] = (int) Math.pow(2, i);
            System.out.print((i == 0 ? "" : ", ") + powersOfTwo[i]);
        }
        System.out.println("}");

        boolean[] booleans = new boolean[6];
        System.out.print("booleans: {");
        for (int i = 0; i < booleans.length; i++) {
            booleans[i] = i != 0 && !booleans[i - 1];
            System.out.print((i == 0 ? "" : ", ") + booleans[i]);
        }
        System.out.println("}");

        System.out.println("\nFor each loops:");
        for (int i: powersOfTwo) System.out.print(i + " ");
        System.out.println();
        for (boolean b: booleans) System.out.print(b + " ");
        System.out.println();
    }
}
