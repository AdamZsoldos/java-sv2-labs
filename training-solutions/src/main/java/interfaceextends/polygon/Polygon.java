package interfaceextends.polygon;

public class Polygon implements Geometric {

    private final int numberOfVertices;
    private final double lengthOfSide;

    public Polygon(int numberOfVertices, double lengthOfSide) {
        this.numberOfVertices = numberOfVertices;
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    @Override
    public double getLengthOfSide() {
        return lengthOfSide;
    }

    @Override
    public double getPerimeter() {
        return numberOfVertices * lengthOfSide;
    }

    @Override
    public int getNumberOfDiagonalsFromOneVertex() {
        return numberOfVertices - 3;
    }

    @Override
    public int getNumberOfAllDiagonals() {
        return getNumberOfDiagonalsFromOneVertex() * numberOfVertices / 2;
    }
}
