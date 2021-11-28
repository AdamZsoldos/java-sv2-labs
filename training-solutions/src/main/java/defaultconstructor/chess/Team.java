package defaultconstructor.chess;

public class Team {

    private Player playerOne;
    private Player playerTwo;

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public int numFreeSlots() {
        int result = 0;
        if (playerOne == null) result++;
        if (playerTwo == null) result++;
        return result;
    }

    public boolean addPlayer(Player player) {
        if (playerOne == null) {
            playerOne = player;
            return true;
        } else if (playerTwo == null) {
            playerTwo = player;
            return true;
        } else {
            return false;
        }
    }

    public void empty() {
        playerOne = null;
        playerTwo = null;
    }
}
