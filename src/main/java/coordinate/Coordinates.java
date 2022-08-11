package coordinate;

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
        return coordinates.get(SECOND_INDEX);
    }

    public boolean hasSecond() {
        return coordinates.size() == 2;
    }
}
