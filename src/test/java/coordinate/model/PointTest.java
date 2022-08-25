package coordinate.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    void 좌표값이_좌표_범위를_넘는_경우() {
        assertThrows(IllegalArgumentException.class, () -> new Point(-1, 0));
        assertThrows(IllegalArgumentException.class, () -> new Point(0, -1));

        assertThrows(IllegalArgumentException.class, () -> new Point(25, 0));
        assertThrows(IllegalArgumentException.class, () -> new Point(0, 25));
    }

    @Test
    void create() {
        assertEquals(new Point(1,24), new Point(1, 24));
        assertNotEquals(new Point(1, 24), new Point(1, 23));
    }
}
