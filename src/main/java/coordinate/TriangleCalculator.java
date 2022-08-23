package coordinate;

import coordinate.distance.Coordinates;
import coordinate.distance.DistanceCalculator;

public class TriangleCalculator extends DistanceCalculator {

    private final Coordinates threePoints;


    public TriangleCalculator(Coordinates threePoints) {
        TriangleChecker triangleChecker = new TriangleChecker(threePoints);

        if (!triangleChecker.isTriangle()) {
            throw new IllegalArgumentException("삼각형이 아닙니다.");
        }

        this.threePoints = threePoints;
    }

    @Override
    public double calculateArea() {
        double lineA = extractLineBy(0, 1);
        double lineB = extractLineBy(0, 2);
        double lineC = extractLineBy(1, 2);

        double area = (lineA + lineB + lineC) / 2;

        return Math.round(Math.sqrt(area * (area - lineA) * (area - lineB) * (area - lineC)));
    }

    private double extractLineBy(int pointA, int pointB) {
        Coordinates twoPoints = new Coordinates();
        twoPoints.add(threePoints.findCoordinateAt(pointA));
        twoPoints.add(threePoints.findCoordinateAt(pointB));
        report(twoPoints);
        return extractSquareRoot();
    }
}
