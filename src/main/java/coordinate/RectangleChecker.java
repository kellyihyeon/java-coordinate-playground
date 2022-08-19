package coordinate;

import coordinate.distance.Coordinates;

public class RectangleChecker {


    public RectangleChecker(Coordinates points) {
        if (!points.hasFourPoints()) {
            throw new IllegalArgumentException("사각형이 되려면 좌표가 4개가 필요합니다.");
        }
    }

    public boolean isRectangle() {
        return false;
    }
}
