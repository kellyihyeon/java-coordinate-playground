package rentcompany.car;

public abstract class AbstractCar implements Car {

    private final double tripDistance;
    private final double distancePerLiter;

    public AbstractCar(double tripDistance, double distancePerLiter) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = distancePerLiter;
    }

    @Override
    public double getFuelChargeQuantity() {
        return tripDistance / distancePerLiter;
    }
}
