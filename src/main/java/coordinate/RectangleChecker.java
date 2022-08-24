package coordinate;

import coordinate.distance.Coordinates;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RectangleChecker {

    private final int RECTANGLE_POINTS = 4;
    private final Map<String, Integer> checker = new HashMap<>();


    public RectangleChecker(Coordinates points) {
        if (!points.hasExactPoints(RECTANGLE_POINTS)) {
            throw new IllegalArgumentException("사각형이 되려면 좌표가 4개가 필요합니다.");
        }

        saveAllToChecker(points);
    }

    private void saveAllToChecker(Coordinates points) {
        Map<String, Set<Integer>> counter = points.countPoints();
        checker.put("x", counter.get("x").size());
        checker.put("y", counter.get("y").size());
    }

    public boolean isRectangle() {
        return checker.get("x") == 2 && checker.get("y") == 2;
    }
}
