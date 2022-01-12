package nestedclasses.soccer;

import java.util.ArrayList;
import java.util.List;

public class Championship {

    private final List<TeamStatistics> leagueTable = new ArrayList<>();

    public List<TeamStatistics> getLeagueTable() {
        return leagueTable;
    }

    public void addGameResult(GameResult result) {
        addMatchStatistics(result.homeTeam, result.goalsScoredByHomeTeam, result.goalsScoredByGuestTeam);
        addMatchStatistics(result.guestTeam, result.goalsScoredByGuestTeam, result.goalsScoredByHomeTeam);
    }

    private void addMatchStatistics(String teamName, int goalsScored, int goalsConceded) {
        TeamStatistics teamStatistics = null;
        for (TeamStatistics current : leagueTable) {
            if (current.getTeamName().equals(teamName)) {
                teamStatistics = current;
                break;
            }
        }
        if (teamStatistics == null) {
            teamStatistics = new TeamStatistics(teamName);
            leagueTable.add(teamStatistics);
        }
        teamStatistics.addMatchStatistics(goalsScored, goalsConceded);
    }

    public static class GameResult {
        private final String homeTeam;
        private final String guestTeam;
        private final int goalsScoredByHomeTeam;
        private final int goalsScoredByGuestTeam;

        public GameResult(String homeTeam, String guestTeam, int goalsScoredByHomeTeam, int goalsScoredByGuestTeam) {
            this.homeTeam = homeTeam;
            this.guestTeam = guestTeam;
            this.goalsScoredByHomeTeam = goalsScoredByHomeTeam;
            this.goalsScoredByGuestTeam = goalsScoredByGuestTeam;
        }
    }
}
