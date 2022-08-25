package coordinate;

import coordinate.model.Point;
import coordinate.distance.Coordinates;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesTest {

    private Coordinates coordinates;

    @BeforeEach
    void setUp() {
        coordinates = new Coordinates();
    }

    @Test
    @DisplayName("좌표값이 하나인데 두번째 좌표값을 요청하면 IllegalArgumentException 예외가 발생한다.")
    void 두번째_좌표값이_존재하지_않는_경우() {
        coordinates.add(new Point(24, 24));
        assertThrows(IllegalArgumentException.class, () -> coordinates.findCoordinateAt(1));
    }

    @Test
    void create() {
        coordinates.add(new Point(10, 8));

        assertFalse(coordinates.isEmpty());
    }

}