package coordinate;

import coordinate.distance.Coordinates;

import java.sql.ClientInfoStatus;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RectangleChecker {

    Map<String, Map<Integer, Integer>> checker = new HashMap<>();


    public RectangleChecker(Coordinates points) {
        if (!points.hasFourPoints()) {
            throw new IllegalArgumentException("사각형이 되려면 좌표가 4개가 필요합니다.");
        }
        savePointsToStore(points);
    }

    private void savePointsToStore(Coordinates points) {
        saveXPoints(points);
        saveYPoints(points);

    }

    private void saveYPoints(Coordinates points) {
        List<Integer> allY = points.findAllY();
        Map<Integer, Integer> storeY = new HashMap<>();
        for (Integer y : allY) {
            storeY.put(y, storeY.getOrDefault(y, 0) + 1);
        }

        checker.put("y", storeY);
    }

    private void saveXPoints(Coordinates points) {
        List<Integer> allX = points.findAllX();
        Map<Integer, Integer> storeX = new HashMap<>();
        for (Integer x : allX) {
            storeX.put(x, storeX.getOrDefault(x, 0) + 1);
        }

        checker.put("x", storeX);
    }

    public boolean isRectangle() {
        return checker.get("x").size() == 2 && checker.get("y").size() == 2;
    }
}
