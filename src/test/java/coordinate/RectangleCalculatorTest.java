package coordinate;

import coordinate.distance.Coordinate;
import coordinate.distance.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleCalculatorTest {


    @Test
    void 사각형이_아닌_경우() {
        Coordinates fourPoints = new Coordinates();
        fourPoints.add(new Coordinate(10, 10));
        fourPoints.add(new Coordinate(22, 10));
        fourPoints.add(new Coordinate(22, 18));
        fourPoints.add(new Coordinate(8, 18));

        assertThrows(IllegalArgumentException.class, () -> new RectangleCalculator(fourPoints));
    }

    @Test
    void create() {
        Coordinates threePoints = new Coordinates();
        threePoints.add(new Coordinate(10, 10));
        threePoints.add(new Coordinate(22, 10));
        threePoints.add(new Coordinate(22, 18));

        assertThrows(IllegalArgumentException.class, () -> new RectangleCalculator(threePoints));
    }
}
