package coordinate.model;

import java.util.List;

public class Line {

    private static final String ERROR_NULL_MESSAGE = "잘못된 좌표값 입니다.";
    private final List<Point> points;

    public Line(List<Point> points) {
        if (points == null || points.isEmpty()) {
            throw new IllegalArgumentException(ERROR_NULL_MESSAGE);
        }
        this.points = points;
    }

    public double area() {
        return points.get(0).calculateDistance(points.get(1));
    }
}
