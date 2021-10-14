package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Let us know what your favorite song is!");
        System.out.println("The song's title:");
        song.title = scanner.nextLine();

        System.out.println("Performed by:");
        song.band = scanner.nextLine();

        System.out.println("The song's length (in minutes):");
        song.length = scanner.nextInt();

        System.out.println("Your favorite song is:");
        System.out.println(song.band + " — " + song.title + " (" + song.length + " min)");

    }

}
