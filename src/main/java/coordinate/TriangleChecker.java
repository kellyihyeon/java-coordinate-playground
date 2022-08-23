package coordinate;

import coordinate.distance.Coordinates;

public class TriangleChecker {

    private final int TRIANGLE_POINTS = 3;
    private final Coordinates threePoints;


    public TriangleChecker(Coordinates threePoints) {
        if (!threePoints.hasExactPoints(TRIANGLE_POINTS)) {
            throw new IllegalArgumentException("삼각형이 되려면 좌표가 3개가 필요합니다.");
        }

        this.threePoints = threePoints;
    }

    public boolean isTriangle() {
        return threePoints.hasExactPoints(TRIANGLE_POINTS);
    }
}
