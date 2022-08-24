package coordinate.distance;

import java.util.*;

public class Coordinates {

    private final List<Coordinate> points = new ArrayList<>();



    public void add(Coordinate coordinate) {
        points.add(coordinate);
    }

    public Coordinate findCoordinateAt(int index) {
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

    public boolean hasFourPoints() {
        return points.size() == 4;
    }

    public List<Integer> findAllX() {
        List<Integer> allX = new LinkedList<>();
        for (Coordinate point : points) {
            allX.add(point.getX());
        }
        return allX;
    }

    public List<Integer> findAllY() {
        List<Integer> allY = new LinkedList<>();
        for (Coordinate point : points) {
            allY.add(point.getY());
        }
        return allY;
    }

    public Coordinate findAny() {
        return points.stream().findAny().orElseThrow(() -> new IllegalArgumentException("좌표가 존재하지 않습니다."));
    }

    public boolean hasExactPoints(int numberOfPoints) {
        return points.size() == numberOfPoints;
    }

    public Coordinates findAllByStandardPoint(Coordinate standardPoint) {
        Coordinates points = new Coordinates();

        this.points.stream()
                .filter(point -> !standardPoint.equals(point))
                .filter(point -> standardPoint.getX() == point.getX() || standardPoint.getY() == point.getY())
                .forEach(points::add);

        return points;
    }

    public List<Coordinate> getIterator() {
        return this.points;
    }
}
