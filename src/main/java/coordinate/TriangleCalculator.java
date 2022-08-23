package coordinate;

import coordinate.distance.Coordinates;

public class TriangleCalculator {

    private final Coordinates threePoints;


    public TriangleCalculator(Coordinates threePoints) {
        TriangleChecker triangleChecker = new TriangleChecker(threePoints);

        if (!triangleChecker.isTriangle()) {
            throw new IllegalArgumentException("삼각형이 아닙니다.");
        }

        this.threePoints = threePoints;
    }
}
