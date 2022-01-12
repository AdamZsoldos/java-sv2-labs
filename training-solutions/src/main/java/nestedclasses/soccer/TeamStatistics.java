package nestedclasses.soccer;

import java.util.Objects;

public class TeamStatistics {

    private final String teamName;
    private final MatchStatistics matchStatistics = new MatchStatistics();
    private final GoalStatistics goalStatistics = new GoalStatistics();
    private static final int POINTS_PER_MATCH_WON = 3;
    private static final int POINTS_PER_MATCH_TIED = 1;
    private static final int POINTS_PER_MATCH_LOST = 0;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public MatchStatistics getMatchStatistics() {
        return matchStatistics;
    }

    public GoalStatistics getGoalStatistics() {
        return goalStatistics;
    }

    public static class MatchStatistics {
        private int played = 0;
        private int won = 0;
        private int tied = 0;
        private int lost = 0;
        private int points = 0;

        public int getPlayed() {
            return played;
        }

        public int getWon() {
            return won;
        }

        public int getTied() {
            return tied;
        }

        public int getLost() {
            return lost;
        }

        public int getPoints() {
            return points;
        }
    }

    public static class GoalStatistics {
        private int scored = 0;
        private int conceded = 0;

        public int getScored() {
            return scored;
        }

        public int getConceded() {
            return conceded;
        }
    }

    public void addMatchStatistics(int goalsScored, int goalsConceded) {
        goalStatistics.scored += goalsScored;
        goalStatistics.conceded += goalsConceded;
        matchStatistics.played++;
        if (goalsScored > goalsConceded) {
            matchStatistics.won++;
            matchStatistics.points += POINTS_PER_MATCH_WON;
        } else if (goalsConceded > goalsScored) {
            matchStatistics.lost++;
            matchStatistics.points += POINTS_PER_MATCH_LOST;
        } else {
            matchStatistics.tied++;
            matchStatistics.points += POINTS_PER_MATCH_TIED;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatistics that = (TeamStatistics) o;
        return teamName.equals(that.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }
}
