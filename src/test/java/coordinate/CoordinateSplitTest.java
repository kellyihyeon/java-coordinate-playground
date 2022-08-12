package coordinate;

import coordinate.distance.Coordinate;
import coordinate.distance.CoordinateSplit;
import coordinate.distance.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateSplitTest {

    @Test
    void 좌표값이_두개일_때() {
        String input = "(10,10)-(14,15)";
        Coordinates coordinates = CoordinateSplit.byDash(input);

        assertEquals(new Coordinate(10, 10), coordinates.findCoordinateAt(0));
        assertEquals(new Coordinate(14, 15), coordinates.findCoordinateAt(1));
    }

    @Test
    void 좌표값이_하나일_때() {
        String input = "(10,10)";
        Coordinate coordinate = CoordinateSplit.byComma(input);
        assertEquals(new Coordinate(10, 10), coordinate);
    }
}
