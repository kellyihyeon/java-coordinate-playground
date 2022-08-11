package coordinate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DistanceCalculatorTest {

    DistanceCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new DistanceCalculator();
    }

    @Test
    void 두_좌표_사이_거리_구하기() {
        Coordinates coordinates = new Coordinates();
        coordinates.add(new Coordinate(10, 10));
        coordinates.add(new Coordinate(14, 15));

        calculator.report(coordinates);
        double distance = calculator.extractSquareRoot();

        assertEquals(6.403124, distance, 0.000001);

    }

    @Test
    void create() {
        Coordinates coordinates = new Coordinates();
        coordinates.add(new Coordinate(10, 10));
        coordinates.add(new Coordinate(24, 24));

        calculator.report(coordinates);

        assertTrue(calculator.hasCoordinate());
    }
}
