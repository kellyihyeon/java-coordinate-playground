package coordinate.domain;

public class K5 extends Car {

    private final String MODEL_NAME = "K5";
    private final double tripDistance;
    private final double DISTANCE_PER_LITER = 13;


    public K5(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getModelName() {
        return MODEL_NAME;
    }
}
