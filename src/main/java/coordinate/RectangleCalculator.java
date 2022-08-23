package coordinate;

import coordinate.distance.Coordinate;
import coordinate.distance.Coordinates;
import coordinate.distance.DistanceCalculator;

public class RectangleCalculator extends DistanceCalculator {

    private final Coordinates fourPoints;


    public RectangleCalculator(Coordinates fourPoints) {
        RectangleChecker rectangleChecker = new RectangleChecker(fourPoints);
        if (!rectangleChecker.isRectangle()) {
            throw new IllegalArgumentException("사각형 모양이 아닙니다.");
        }

        this.fourPoints = fourPoints;
    }

    @Override
    public double calculateArea() {
        Coordinate standard = fourPoints.findAny();
        return extractWidth(standard) * extractHeight(standard);
    }

    private double extractHeight(Coordinate standard) {
        Coordinate samePointByX = fourPoints.findPointToSameX(standard);

        Coordinates coordinates = new Coordinates();
        coordinates.add(standard);
        coordinates.add(samePointByX);

        report(coordinates);
        return extractSquareRoot();
    }

    private double extractWidth(Coordinate standard) {
        Coordinate samePointByY = fourPoints.findPointToSameY(standard);

        Coordinates coordinates = new Coordinates();
        coordinates.add(standard);
        coordinates.add(samePointByY);

        report(coordinates);
        return extractSquareRoot();
    }

}
