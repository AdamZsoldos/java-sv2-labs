package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        System.out.println("\nSzám beírásával válassz az alábbi menüpontokból:\n");
        System.out.println("1 - Felhasználók listázása");
        System.out.println("2 - Felhasználó felvétele");
        System.out.println("Bármi más - Kilépés");

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        if ("1".equals(command)) System.out.println("Felhasználók listázása");
        else if ("2".equals(command)) System.out.println("Felhasználók felvétele");
    }
}
