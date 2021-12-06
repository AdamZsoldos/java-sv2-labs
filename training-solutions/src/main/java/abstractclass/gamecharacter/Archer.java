package abstractclass.gamecharacter;

public class Archer extends Character {

    private int numberOfArrows;

    public Archer(Point startingPosition) {
        setPosition(startingPosition);
        numberOfArrows = 100;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    @Override
    public void secondaryAttack(Character target) {
        shootArrowAtTarget(target);
    }

    private void shootArrowAtTarget(Character target) {
        if (numberOfArrows < 1) { return; }
        numberOfArrows--;
        hitTarget(target, getActualSecondaryDamage());
    }

    private int getActualSecondaryDamage() {
        return getRandom().nextInt(1, 6);
    }
}
