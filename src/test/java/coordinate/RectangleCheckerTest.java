package coordinate;

import coordinate.model.Point;
import coordinate.distance.Coordinates;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleCheckerTest {

    @Test
    void 좌표가_4개가_아닌_경우() {
        Coordinates triangle = new Coordinates();
        triangle.add(new Point(10, 10));
        triangle.add(new Point(22, 10));
        triangle.add(new Point(22, 18));

        assertThrows(IllegalArgumentException.class, () -> new RectangleChecker(triangle));
    }

    @Test
    @DisplayName("4개의 좌표 중에서 y축 2개가 같지 않으면 마름모이다.")
    void 마름모인_경우() {
        Coordinates diamond = new Coordinates();
        diamond.add(new Point(10, 10));
        diamond.add(new Point(22, 15));
        diamond.add(new Point(22, 18));
        diamond.add(new Point(10, 18));

        RectangleChecker checker = new RectangleChecker(diamond);
        assertFalse(checker.isRectangle());
    }

    @Test
    @DisplayName("4개의 좌표 중에서 x축 2개가 같지 않으면 사다리꼴이다.")
    void 사다리꼴인_경우() {
        Coordinates trapezoid = new Coordinates();
        trapezoid.add(new Point(10, 10));
        trapezoid.add(new Point(22, 10));
        trapezoid.add(new Point(22, 18));
        trapezoid.add(new Point(8, 18));

        RectangleChecker checker = new RectangleChecker(trapezoid);
        assertFalse(checker.isRectangle());
    }

    @Test
    @DisplayName("4개의 좌표 중에서 x축 2개가 같고, y축 2개가 같으면 사각형이다.")
    void 사각형인_경우() {
        Coordinates rectangle = new Coordinates();
        rectangle.add(new Point(10, 10));
        rectangle.add(new Point(22, 10));
        rectangle.add(new Point(22, 18));
        rectangle.add(new Point(10, 18));

        RectangleChecker checker = new RectangleChecker(rectangle);
        assertTrue(checker.isRectangle());
    }

}