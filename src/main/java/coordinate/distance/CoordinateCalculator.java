package coordinate.distance;

public abstract class CoordinateCalculator implements Calculable{

    private Coordinates coordinates;


    public void report(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public boolean hasCoordinate() {
        return coordinates != null;
    }

    public double extractSquareRoot() {
        Coordinate first = coordinates.findCoordinateAt(0);
        Coordinate second = coordinates.findCoordinateAt(1);
        double pow = Math.pow((first.getX() - second.getX()), 2) + Math.pow((first.getY() - second.getY()), 2);
        return Math.sqrt(pow);
    }


}
