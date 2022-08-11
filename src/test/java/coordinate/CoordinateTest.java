package coordinate;

import coordinate.distance.Coordinate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {

    @Test
    @DisplayName("x,y의 좌표값이 24를 넘으면 IllegalArgumentException 예외가 발생한다.")
    void 좌표값이_24를_넘는_경우() {
        assertThrows(IllegalArgumentException.class, () -> new Coordinate(25, 25));
    }

    @Test
    void create() {
        Coordinate coordinate = new Coordinate(24, 24);

        assertTrue(coordinate.isMatched(new Coordinate(24, 24)));
        assertFalse(coordinate.isMatched(new Coordinate(5, 5)));
    }
}
