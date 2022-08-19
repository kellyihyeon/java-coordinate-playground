package coordinate;

import coordinate.distance.Coordinate;
import coordinate.distance.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleCalculatorTest {



    @Test
    void create() {
        Coordinates threePoints = new Coordinates();
        threePoints.add(new Coordinate(10, 10));
        threePoints.add(new Coordinate(22, 10));
        threePoints.add(new Coordinate(22, 18));

        assertThrows(IllegalArgumentException.class, () -> new RectangleCalculator(threePoints));
    }
}
