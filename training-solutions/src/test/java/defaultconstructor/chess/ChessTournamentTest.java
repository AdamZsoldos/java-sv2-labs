package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {

    ChessTournament tournament = new ChessTournament(3);

    @Test
    void testAddPlayersToTeams() {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            players.add(new Player());
        }
        players = tournament.addPlayersToTeams(players);
        assertEquals(3, players.size());
        assertEquals(0, tournament.getTeams().get(0).numFreeSlots());
        assertEquals(0, tournament.getTeams().get(1).numFreeSlots());
        assertEquals(0, tournament.getTeams().get(2).numFreeSlots());
        tournament.getTeams().get(0).empty();
        tournament.getTeams().get(1).empty();
        tournament.getTeams().get(2).empty();
        players = tournament.addPlayersToTeams(players);
        assertEquals(0, players.size());
        assertEquals(0, tournament.getTeams().get(0).numFreeSlots());
        assertEquals(1, tournament.getTeams().get(1).numFreeSlots());
        assertEquals(2, tournament.getTeams().get(2).numFreeSlots());
    }
}
