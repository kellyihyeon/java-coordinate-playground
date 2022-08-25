package coordinate.distance;

import coordinate.model.Point;

public abstract class DistanceCalculator implements Calculable{

    private Coordinates twoPoints;


    public void report(Coordinates twoPoints) {
        this.twoPoints = twoPoints;
    }

    public boolean hasCoordinate() {
        return twoPoints != null;
    }

    public double extractSquareRoot() {
        Point first = twoPoints.findCoordinateAt(0);
        Point second = twoPoints.findCoordinateAt(1);
        double pow = Math.pow((first.getX() - second.getX()), 2) + Math.pow((first.getY() - second.getY()), 2);
        return Math.sqrt(pow);
    }


}
