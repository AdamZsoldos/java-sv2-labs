package methodstructure.bmi;

public class BodyMass {

    private final double weight;
    private final double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBodyMassIndex() {
        return weight / Math.pow(height, 2);
    }

    public BmiCategory getBody() {
        double bmi = getBodyMassIndex();
        if (bmi < 18.5) return BmiCategory.UNDERWEIGHT;
        if (bmi > 25.0) return BmiCategory.OVERWEIGHT;
        return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan(BodyMass bm) {
        return getBodyMassIndex() < bm.getBodyMassIndex();
    }
}
