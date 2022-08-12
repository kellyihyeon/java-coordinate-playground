package coordinate;

import coordinate.distance.Coordinate;
import coordinate.distance.Coordinates;
import coordinate.distance.CoordinateCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateCalculatorTest {

    static class SampleCalculator extends CoordinateCalculator {

        @Override
        public double calculate() {
            return 0;
        }
    }

    private SampleCalculator sut;

    @BeforeEach
    void setUp() {
        sut = new SampleCalculator();
    }

    @Test
    void 두_좌표_사이_거리_구하기() {
        Coordinates coordinates = new Coordinates();
        coordinates.add(new Coordinate(10, 10));
        coordinates.add(new Coordinate(14, 15));

        sut.report(coordinates);
        double distance = sut.extractSquareRoot();

        assertEquals(6.403124, distance, 0.000001);
    }

    @Test
    void create() {
        Coordinates coordinates = new Coordinates();
        coordinates.add(new Coordinate(10, 10));
        coordinates.add(new Coordinate(24, 24));

        sut.report(coordinates);

        assertTrue(sut.hasCoordinate());
    }
}
