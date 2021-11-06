package controliteration.exit;

import java.util.Scanner;

public class Exit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető.\nKilépés: x billentyű megnyomásával");
        while (!scanner.nextLine().equalsIgnoreCase("x"));
    }
}
