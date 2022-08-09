package coordinate.domain;

public class Avante extends Car {

    private final String MODEL_NAME = "Avante";
    private final double tripDistance;
    private final double DISTANCE_PER_LITER = 15;


    public Avante(double tripDistance) {
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
