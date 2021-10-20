package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysMain {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println();
        System.out.println("Number of Days in Each Month");
        System.out.println("----------------------------");
        System.out.println(numberOfDaysAsString());
        System.out.println();

        System.out.println("Multiplication Table");
        System.out.println("--------------------");
        System.out.println(multiplicationTableAsString(9));
        System.out.println();

        System.out.println("Daily Temperature Comparison");
        System.out.println("----------------------------");
        double[] day1 = randomTemps(24, random);
        double[] day2 = Arrays.copyOf(day1, day1.length);
        double[] day3 = Arrays.copyOf(day1, day1.length - 1);
        double[] day4 = randomTemps(24, random);
        System.out.println("day1: " + Arrays.toString(day1));
        System.out.println("day2: " + Arrays.toString(day2));
        System.out.println("day3: " + Arrays.toString(day3));
        System.out.println("day4: " + Arrays.toString(day4));
        System.out.println("sameTempValues(day1, day2): " + sameTempValues(day1, day2));
        System.out.println("sameTempValues(day1, day3): " + sameTempValues(day1, day3));
        System.out.println("sameTempValues(day1, day4): " + sameTempValues(day1, day4));
        System.out.println("sameTempValuesDaylight(day1, day2): " + sameTempValuesDaylight(day1, day2));
        System.out.println("sameTempValuesDaylight(day1, day3): " + sameTempValuesDaylight(day1, day3));
        System.out.println("sameTempValuesDaylight(day1, day4): " + sameTempValuesDaylight(day1, day4));
        System.out.println();

        System.out.println("Lottery");
        System.out.println("-------");
        int[] numbers1 = randomNumbers(5, random);
        int[] numbers2 = Arrays.copyOf(numbers1, numbers1.length);
        shuffleArray(numbers2, random);
        int[] numbers3 = randomNumbers(5, random);
        System.out.println("numbers1: " + Arrays.toString(numbers1));
        System.out.println("numbers2: " + Arrays.toString(numbers2));
        System.out.println("numbers3: " + Arrays.toString(numbers3));
        System.out.println("wonLottery(numbers1, numbers2): " + wonLottery(numbers1, numbers2));
        System.out.println("wonLottery(numbers1, numbers3): " + wonLottery(numbers1, numbers3));
        System.out.println("numbers1: " + Arrays.toString(numbers1));
        System.out.println("numbers2: " + Arrays.toString(numbers2));
        System.out.println("numbers3: " + Arrays.toString(numbers3));
    }

    public static String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public static String multiplicationTableAsString(int size) {
        int[][] a = new int[size][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[size];
            for (int j = 0; j < a[i].length; j++) a[i][j] = (i + 1) * (j + 1);
        }
        return Arrays.deepToString(a);
    }

    public static boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public static boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int to = day.length <= anotherDay.length ? day.length - 1 : anotherDay.length - 1;
        return Arrays.equals(Arrays.copyOfRange(day, 0, to), Arrays.copyOfRange(anotherDay, 0, to));
    }

    public static double[] randomTemps(int length, Random random) {
        double[] a = new double[length];
        for (int i = 0; i < a.length; i++) a[i] = randomTemp(random);
        return a;
    }

    public static double randomTemp(Random random) {
        return Math.floor((20 + random.nextDouble() * 12) * 100) / 100;
    }

    public static boolean wonLottery(int[] numbers1, int[] numbers2) {
        int[] a1 = Arrays.copyOf(numbers1, numbers1.length);
        int[] a2 = Arrays.copyOf(numbers2, numbers2.length);
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static int[] randomNumbers(int length, Random random) {
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++) a[i] = randomNumber(random);
        return a;
    }

    public static int randomNumber(Random random) {
        return random.nextInt(1, 50);
    }

    public static void shuffleArray(int[] a, Random random)
    {
        for (int i = 0; i < a.length; i++) {
            int j = random.nextInt(a.length);
            //Swap values of a[i] and a[j]
            int value = a[i];
            a[i] = a[j];
            a[j] = value;
        }
    }
}
