package coordinate;

import coordinate.distance.Coordinates;
import coordinate.distance.DistanceCalculator;

public class RectangleCalculator extends DistanceCalculator {

    private final Coordinates fourPoints;


    public RectangleCalculator(Coordinates fourPoints) {
        if (!fourPoints.isRectangle()) {
            throw new IllegalArgumentException("사각형이 되려면 좌표가 4개가 필요합니다.");
        }
        this.fourPoints = fourPoints;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

}
