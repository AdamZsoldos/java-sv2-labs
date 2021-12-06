package abstractclass.gamecharacter;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.conductFight(1, new Archer(new Point(0, 0)), new AxeWarrior(new Point(2, 0)));
        main.conductFight(2, new Archer(new Point(0, 0)), new AxeWarrior(new Point(1, 0)));
        main.conductFight(3, new Archer(new Point(0, 0)), new Archer(new Point(10, 0)));
        main.conductFight(4, new AxeWarrior(new Point(0, 0)), new AxeWarrior(new Point(1, 0)));
    }

    private void conductFight(int id, Character character1, Character character2) {
        BattleField battleField = new BattleField();
        Character winner = battleField.fight(character1, character2);
        System.out.println("Fight " + id + " lasted " + battleField.getRound() + " rounds. Winner: character " + (winner == character1 ? "1" : "2") + " (" + (winner.getClass() == Archer.class ? "Archer" : "Axe Warrior") + ").");
    }
}
