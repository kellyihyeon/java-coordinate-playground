package coordinate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {

    @Test
    void create() {
        Coordinate coordinate = new Coordinate(10, 5);

        assertTrue(coordinate.isMatched(new Coordinate(10, 5)));
        assertFalse(coordinate.isMatched(new Coordinate(5, 5)));
    }
}
