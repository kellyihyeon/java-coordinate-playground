package coordinate.distance;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {

    private final List<Coordinate> coordinates = new ArrayList<>();

    public void add(Coordinate coordinate) {
        coordinates.add(coordinate);
    }

    public Coordinate findCoordinateAt(int index) {
        if (!isExisted(index)) {
            throw new IllegalArgumentException(index + "번째 좌표값이 존재하지 않습니다.");
        }
        return coordinates.get(index);
    }

    private boolean isExisted(int index) {
        return coordinates.size() >= index + 1;
    }

    public boolean isEmpty() {
        return coordinates.isEmpty();
    }
}
