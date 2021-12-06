package abstractclass.gamecharacter;

public class AxeWarrior extends Character {

    public AxeWarrior(Point startingPosition) {
        setPosition(startingPosition);
    }

    @Override
    public void secondaryAttack(Character target) {
        if (getPosition().distanceTo(target.getPosition()) < 2) {
            hitTarget(target, getActualSecondaryDamage());
        }
    }

    private int getActualSecondaryDamage() {
        return getRandom().nextInt(1, 21);
    }
}
