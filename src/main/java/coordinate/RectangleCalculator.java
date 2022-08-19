package coordinate;

import coordinate.distance.Coordinates;
import coordinate.distance.DistanceCalculator;

public class RectangleCalculator extends DistanceCalculator {

    private final Coordinates fourPoints;


    public RectangleCalculator(Coordinates fourPoints) {
        if (!fourPoints.hasFourPoints()) {
            throw new IllegalArgumentException("사각형이 되려면 좌표가 4개가 필요합니다.");
        }

        RectangleChecker rectangleChecker = new RectangleChecker(fourPoints);
        if (!rectangleChecker.isRectangle()) {
            throw new IllegalArgumentException("사각형 모양이 아닙니다.");
        }

        this.fourPoints = fourPoints;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

}
