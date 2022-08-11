package coordinate;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateSplitTest {

    @Test
    void 좌표값이_두개일_때() {
        String input = "(10,10)-(14,15)";
        Coordinates coordinates = CoordinateSplit.byDash(input);

        assertEquals(new Coordinate(10, 10), coordinates.findFirstCoordinate());
        assertEquals(new Coordinate(14, 15), coordinates.findSecondCoordinate());
    }

    @Test
    void 좌표값이_하나일_때() {
        String input = "(10,10)";
        List<Integer> coordinates = CoordinateSplit.byComma(input);

        assertEquals(10, coordinates.get(0));
        assertEquals(10, coordinates.get(1));
    }
}
