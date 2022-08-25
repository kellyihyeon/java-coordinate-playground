package coordinate.distance;

import coordinate.model.Point;

import java.util.*;

public class Coordinates {

    private final List<Point> points = new ArrayList<>();


    public void add(Point point) {
        points.add(point);
    }

    public Point findCoordinateAt(int index) {
        if (!isExisted(index)) {
            throw new IllegalArgumentException(index + "번째 좌표값이 존재하지 않습니다.");
        }
        return points.get(index);
    }

    private boolean isExisted(int index) {
        return points.size() >= index + 1;
    }

    public boolean isEmpty() {
        return points.isEmpty();
    }

    public Point findAny() {
        return points.stream().findAny().orElseThrow(() -> new IllegalArgumentException("좌표가 존재하지 않습니다."));
    }

    public boolean hasExactPoints(int numberOfPoints) {
        return points.size() == numberOfPoints;
    }

    public Coordinates findAllByStandardPoint(Point standardPoint) {
        Coordinates matchPoints = new Coordinates();

        this.points.stream()
                .filter(point -> !standardPoint.equals(point))
                .filter(point -> isMatchTo(point, standardPoint))
                .forEach(matchPoints::add);

        return matchPoints;
    }

    private boolean isMatchTo(Point point, Point standardPoint) {
        return standardPoint.getX() == point.getX() || standardPoint.getY() == point.getY();
    }

    public List<Point> getIterator() {
        return this.points;
    }

    public Map<String, Set<Integer>> countPoints() {
        Map<String, Set<Integer>> counter = new HashMap<>();

        Set<Integer> xPoints = new HashSet<>();
        for (Point point : points) {
            xPoints.add(point.getX());
            counter.put("x", xPoints);
        }

        Set<Integer> yPoints = new HashSet<>();
        for (Point point : points) {
            yPoints.add(point.getY());
            counter.put("y", yPoints);
        }

        return counter;
    }
}
