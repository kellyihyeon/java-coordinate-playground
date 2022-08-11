package coordinate;

public class DistanceCalculator {

    private Coordinates coordinates;


    public void report(Coordinates coordinates) {
        this.coordinates = coordinates;
    }


    public boolean hasCoordinate() {
        return coordinates != null;
    }

    public double extractSquareRoot() {
        double pow = 0;
        if (coordinates.hasSecond()) {
            Coordinate first = coordinates.findFirstCoordinate();
            Coordinate second = coordinates.findSecondCoordinate();
            pow = Math.pow((first.getX() - second.getX()), 2) + Math.pow((first.getY() - second.getY()), 2);
        }
        return Math.sqrt(pow);
    }
}
