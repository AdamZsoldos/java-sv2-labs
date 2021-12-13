package isahasa.ship;

public class CanCarryGoodsBehaviour implements CanCarryGoods {

    private int cargoWeight;
    private final int maxCargoWeight;

    protected CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        this.cargoWeight += cargoWeight;
        int excessWeight = Math.max(this.cargoWeight - maxCargoWeight, 0);
        if (excessWeight > 0) { this.cargoWeight = maxCargoWeight; }
        return excessWeight;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }

    public int getMaxCargoWeight() {
        return maxCargoWeight;
    }
}
