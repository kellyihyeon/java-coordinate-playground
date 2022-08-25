package coordinate.model;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LineTest {

    @Test
    void 두_좌표의_길이_구하기() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(14, 15));
        Line line = new Line(points);
        assertEquals(6.403124, line.area(), 0.000001);
    }

    @Test
    void create() {
        assertThrows(IllegalArgumentException.class, () -> new Line(null));
    }
}
