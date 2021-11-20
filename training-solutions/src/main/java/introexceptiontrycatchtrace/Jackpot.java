package introexceptiontrycatchtrace;

public class Jackpot {

    public static void main(String[] args) {
        try {
            System.out.println(new Winner().getWinner());
        }
        catch (NullPointerException e) {
            System.out.println("No winner today. :(");
        }
    }
}
