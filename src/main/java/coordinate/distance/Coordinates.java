package coordinate.distance;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {

    private final List<Coordinate> coordinates = new ArrayList<>();

    public void add(Coordinate coordinate) {
        coordinates.add(coordinate);
    }

    public Coordinate findFirstCoordinate() {
        final int FIRST_INDEX = 0;
        return coordinates.get(FIRST_INDEX);
    }

    public Coordinate findSecondCoordinate() {
        final int SECOND_INDEX = 1;
        if (!hasSecond()) {
            throw new IllegalArgumentException("두번째 좌표값이 존재하지 않습니다.");
        }
        return coordinates.get(SECOND_INDEX);
    }

    public boolean hasSecond() {
        return coordinates.size() == 2;
    }

    public boolean isEmpty() {
        return coordinates.isEmpty();
    }
}
