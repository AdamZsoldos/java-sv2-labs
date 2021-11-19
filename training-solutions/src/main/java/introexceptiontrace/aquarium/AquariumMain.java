package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addFish(new Fish("clownfish", "orange"));
        aquarium.addFish(new Fish("gold fish", "gold"));
        aquarium.addFish(new Fish("catfish", "grey"));
        System.out.println(aquarium.getNumberOfFish());
    }
}
