package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint = 100;
    private final Random random = new Random();

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(1, 11);
    }

    private int getActualDefense() {
        return random.nextInt(6);
    }

    protected void hitTarget(Character target, int damage) {
        int defense = target.getActualDefense();
        if (damage > defense) {
            target.decreaseHitPoint(damage - defense);
        }
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }

    public void primaryAttack(Character target) {
        hitTarget(target, getActualPrimaryDamage());
    }

    public abstract void secondaryAttack(Character target);
}
