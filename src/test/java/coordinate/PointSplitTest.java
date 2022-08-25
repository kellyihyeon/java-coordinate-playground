package coordinate;

import coordinate.model.Point;
import coordinate.distance.CoordinateSplit;
import coordinate.distance.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointSplitTest {

    @Test
    void 좌표값이_두개일_때() {
        String input = "(10,10)-(14,15)";
        Coordinates coordinates = CoordinateSplit.byDash(input);

        assertEquals(new Point(10, 10), coordinates.findCoordinateAt(0));
        assertEquals(new Point(14, 15), coordinates.findCoordinateAt(1));
    }

    @Test
    void 좌표값이_하나일_때() {
        String input = "(10,10)";
        Point point = CoordinateSplit.byComma(input);
        assertEquals(new Point(10, 10), point);
    }
}
