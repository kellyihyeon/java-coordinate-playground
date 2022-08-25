package coordinate;

import coordinate.model.Point;
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
        Point standardPoint = fourPoints.findAny();

        double area = 1;
        Coordinates widthAndHeightPoints = fourPoints.findAllByStandardPoint(standardPoint);
        for (Point point : widthAndHeightPoints.getIterator()) {
            Coordinates newPoints = new Coordinates();
            newPoints.add(standardPoint);
            newPoints.add(point);

            report(newPoints);
            area *= extractSquareRoot();
        }

        return area;
    }
}
