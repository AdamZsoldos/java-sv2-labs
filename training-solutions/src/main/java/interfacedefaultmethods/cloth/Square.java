package interfacedefaultmethods.cloth;

public interface Square {

    double getSideLength();

    default int getNumberOfSides() {
        return 4;
    }

    default double getLengthOfDiagonal() {
        return Math.sqrt(Math.pow(getSideLength(), 2) * 2);
    }

    default double getPerimeter() {
        return getSideLength() * getNumberOfSides();
    }

    default double getArea() {
        return Math.pow(getSideLength(), 2);
    }
}
