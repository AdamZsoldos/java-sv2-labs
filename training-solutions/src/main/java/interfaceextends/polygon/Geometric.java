package interfaceextends.polygon;

public interface Geometric extends Vertex, Side {

    double getPerimeter();
    int getNumberOfDiagonalsFromOneVertex();
    int getNumberOfAllDiagonals();
}
