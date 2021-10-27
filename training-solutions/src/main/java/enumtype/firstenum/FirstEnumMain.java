package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        System.out.println(Continent.ASIA);
        System.out.println(Continent.AFRICA);
        System.out.println(Continent.NORTH_AMERICA);
        System.out.println(Continent.SOUTH_AMERICA);
        System.out.println(Continent.ANTARCTICA);
        System.out.println(Continent.EUROPE);
        System.out.println(Continent.AUSTRALIA);
        System.out.println();
        System.out.println(Arrays.toString(Continent.values()));
    }
}
