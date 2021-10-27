package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {

        for (SolarSystem planet: SolarSystem.values()) {
            System.out.println(planet.name() + "'s moons: " + planet.getNumConfirmedMoons() + (planet.getNumProvisionalMoons() != 0 ? " confirmed, " + planet.getNumProvisionalMoons() + " provisional, " + planet.getNumMoons() + " total" : " total"));
        }
    }
}
