package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.List;

public class ChessTournament {

    private final List<Team> teams;

    public ChessTournament(int numberOfTeams) {
        teams = new ArrayList<>();
        for (int i = 0; i < numberOfTeams; i++) {
            teams.add(new Team());
        }
    }

    public List<Team> getTeams() {
        return teams;
    }

    public List<Player> addPlayersToTeams(List<Player> players) {
        List<Player> playersLeft = new ArrayList<>(players);
        while (!playersLeft.isEmpty() && addPlayerToTeams(playersLeft.get(0))) {
            playersLeft.remove(0);
        }
        return playersLeft;
    }

    private boolean addPlayerToTeams(Player player) {
        for (Team team : teams) {
            if (team.addPlayer(player)) return true;
        }
        return false;
    }
}
