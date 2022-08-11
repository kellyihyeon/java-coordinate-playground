package coordinate;

public class DistanceCalculator {

    private Coordinates coordinates;


    public void report(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public boolean hasCoordinate() {
        return coordinates != null;
    }
}
