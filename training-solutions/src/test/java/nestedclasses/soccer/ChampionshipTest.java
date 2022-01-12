package nestedclasses.soccer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChampionshipTest {

    Championship championship = new Championship();

    @Test
    void testCreate() {
        assertEquals(0, championship.getLeagueTable().size());
    }

    @Test
    void testAddGameResult() {
        championship.addGameResult(new Championship.GameResult("Team A", "Team B", 4, 2));
        assertEquals(2, championship.getLeagueTable().size());
        assertTeamStatistics(championship.getLeagueTable().get(0), "Team A", 1, 1, 0, 0, 3, 4, 2);
        assertTeamStatistics(championship.getLeagueTable().get(1), "Team B", 1, 0, 0, 1, 0, 2, 4);
        championship.addGameResult(new Championship.GameResult("Team B", "Team C", 2, 2));
        assertEquals(3, championship.getLeagueTable().size());
        assertTeamStatistics(championship.getLeagueTable().get(1), "Team B", 2, 0, 1, 1, 1, 4, 6);
        assertTeamStatistics(championship.getLeagueTable().get(2), "Team C", 1, 0, 1, 0, 1, 2, 2);
    }

    void assertTeamStatistics(TeamStatistics stats, String teamName, int played, int won, int tied, int lost, int points, int scored, int conceded) {
        assertEquals(teamName, stats.getTeamName());
        assertEquals(played, stats.getMatchStatistics().getPlayed());
        assertEquals(won, stats.getMatchStatistics().getWon());
        assertEquals(tied, stats.getMatchStatistics().getTied());
        assertEquals(lost, stats.getMatchStatistics().getLost());
        assertEquals(points, stats.getMatchStatistics().getPoints());
        assertEquals(scored, stats.getGoalStatistics().getScored());
        assertEquals(conceded, stats.getGoalStatistics().getConceded());
    }
}
