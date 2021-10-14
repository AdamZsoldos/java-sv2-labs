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

        System.out.println("Please enter the song's length in the following format:");
        System.out.println("4:30");
        String[] lengthArray = scanner.nextLine().split(":");
        song.length = Integer.parseInt(lengthArray[0]) * 60 + Integer.parseInt(lengthArray[1]);
        //System.out.println(song.length); // Uncomment line to test length un-formatting operation

        System.out.println("Your favorite song is:");
        System.out.println(song.band + " — " + song.title + " (" + (song.length / 60) + ":" + (song.length % 60) + ")");

    }

}
