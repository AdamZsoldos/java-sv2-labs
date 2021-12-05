package introinheritance.fruit;

public class FruitsMain {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("pomelo");
        fruit.setWeight(0.3);
        System.out.println(fruit.getName() + ", " + fruit.getWeight());

        Grape grape = new Grape();
        grape.setName("grapes");
        grape.setWeight(0.4);
        grape.setType("white");
        System.out.println(grape.getName() + ", " + grape.getWeight() + ", " + grape.getType());

        Apple apple = new Apple();
        apple.setName("generic apple");
        apple.setWeight(0.22);
        apple.setPieces(10);
        System.out.println(apple.getName() + ", " + apple.getWeight() + ", " + apple.getPieces());

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("golden delicious");
        goldenDelicious.setWeight(0.23);
        goldenDelicious.setPieces(12);
        System.out.println(goldenDelicious.getName() + ", " + goldenDelicious.getWeight() + ", " + goldenDelicious.getPieces() + ", " + goldenDelicious.getColor());

        Starking starking = new Starking();
        starking.setName("starking");
        starking.setWeight(0.24);
        starking.setPieces(14);
        System.out.println(starking.getName() + ", " + starking.getWeight() + ", " + starking.getPieces() + ", " + starking.getColor());
    }
}
