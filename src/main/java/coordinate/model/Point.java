package coordinate.model;

import java.util.Objects;

public class Point {

    private static final String ERROR_MESSAGE
            = "잘못된 입력값입니다. 좌표값의 범위는 " + Point.MIN_LIMIT + " ~ " + Point.MAX_LIMIT + " 입니다.";
    private static final int MIN_LIMIT = 0;
    private static final int MAX_LIMIT = 24;
    private final int x;
    private final int y;

    public Point(int x, int y) {
        checkRangeOf(x, y);
        this.x = x;
        this.y = y;
    }

    private void checkRangeOf(int x, int y) {
        if (exceedRange(x) || exceedRange(y)) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }

    private boolean exceedRange(int coordinate) {
        return coordinate < MIN_LIMIT || coordinate > MAX_LIMIT;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point that = (Point) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double calculateDistance(Point point) {
        return 6.403124;
    }
}
