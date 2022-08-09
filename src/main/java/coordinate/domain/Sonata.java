package coordinate.domain;

public class Sonata extends Car {

    private final String MODEL_NAME = "Sonata";
    private final double tripDistance;
    private final double DISTANCE_PER_LITER = 10;


    public Sonata(double tripDistance) {
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
