package coordinate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DistanceCalculatorTest {

    @Test
    void create() {
        DistanceCalculator calculator = new DistanceCalculator();
        Coordinates coordinates = new Coordinates();
        coordinates.add(new Coordinate(10, 10));
        coordinates.add(new Coordinate(24, 24));

        calculator.report(coordinates);

        assertTrue(calculator.hasCoordinate());
    }
}
