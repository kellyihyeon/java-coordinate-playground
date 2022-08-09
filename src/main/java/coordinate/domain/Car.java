package coordinate.domain;

public abstract class Car {

    abstract double getDistancePerLiter();

    abstract double getTripDistance();

    abstract String getModelName();

    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }

}
