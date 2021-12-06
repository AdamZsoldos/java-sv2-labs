package abstractclass.gamecharacter;

public class BattleField {

    private int round = 1;

    public int getRound() {
        return round;
    }

    private boolean playRound(Character attacker, Character target) {
        attacker.primaryAttack(target);
        if (target.isAlive()) { attacker.secondaryAttack(target); }
        return target.isAlive();
    }

    public Character fight(Character character1, Character character2) {
        while (character1.isAlive() && character2.isAlive()) {
            if (playRound(character1, character2) && playRound(character2, character1)) {
                round++;
            }
        }
        return character1.isAlive() ? character1 : character2;
    }
}
