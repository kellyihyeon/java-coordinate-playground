package coordinate;

import java.util.Objects;

public class Coordinate {

    private final int MAX_NUMBER = 24;
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        validateCoordinateValue(x, y);
        this.x = x;
        this.y = y;
    }

    private void validateCoordinateValue(int x, int y) {
        if (isOverMaxNumber(x, y)) {
            throw new IllegalArgumentException("x, y의 값은 24를 초과하면 안됩니다.");
        }
    }

    private boolean isOverMaxNumber(int x, int y) {
        return x > MAX_NUMBER || y > MAX_NUMBER;
    }

    public boolean isMatched(Coordinate coordinate) {
        return this.equals(coordinate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
