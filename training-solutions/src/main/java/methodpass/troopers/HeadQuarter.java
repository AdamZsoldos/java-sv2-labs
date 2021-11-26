package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private final List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        validateTrooper(trooper);
        troopers.add(trooper);
    }

    public void moveClosestTrooper(Position position) {
        validatePosition(position);
        moveTrooper(getClosestTrooper(position), position);
    }

    public void moveTrooperByName(String name, Position position) {
        validateTrooperName(name);
        validatePosition(position);
        moveTrooper(getTrooperByName(name), position);
    }

    private void moveTrooper(Trooper trooper, Position position) {
        if (trooper != null) trooper.setPosition(position);
    }

    private Trooper getClosestTrooper(Position position) {
        Trooper closest = null;
        for (Trooper trooper : troopers) {
            if (closest == null || trooper.distanceTo(position) < closest.distanceTo(position)) {
                closest = trooper;
            }
        }
        return closest;
    }

    private Trooper getTrooperByName(String name) {
        for (Trooper trooper : troopers) {
            if (trooper.getName().equals(name)) return trooper;
        }
        return null;
    }

    private void validateTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("Trooper cannot be null!");
        }
    }

    private void validatePosition(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("Position cannot be null!");
        }
    }

    private void validateTrooperName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        } else if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank!");
        }
    }
}
