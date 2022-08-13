package coordinate;

import coordinate.distance.Coordinate;
import coordinate.distance.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleCalculatorTest {

    @Test
    void create() {
        Coordinates coordinates = new Coordinates();
        coordinates.add(new Coordinate(10,10));
        coordinates.add(new Coordinate(22,10));
        coordinates.add(new Coordinate(22,18));
        coordinates.add(new Coordinate(10,18));

        RectangleCalculator rectangleCalc = new RectangleCalculator();
        rectangleCalc.report(coordinates);

        assertTrue(rectangleCalc.hasCoordinate());
    }
}
