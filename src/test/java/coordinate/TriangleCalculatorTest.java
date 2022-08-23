package coordinate;

import coordinate.distance.Coordinate;
import coordinate.distance.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleCalculatorTest {

    @Test
    void create() {
        Coordinates triangle = new Coordinates();
        triangle.add(new Coordinate(10,10));
        triangle.add(new Coordinate(14,15));

        assertThrows(IllegalArgumentException.class, () -> new TriangleCalculator(triangle));
    }
}
