package coordinate;

import coordinate.distance.CoordinateSplit;
import coordinate.distance.Coordinates;
import coordinate.distance.DistanceCalculator;

import java.util.Scanner;

public class CoordinateBoard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("좌표를 입력하세요");
        String input = scanner.next();
        Coordinates coordinates = CoordinateSplit.byDash(input);

        DistanceCalculator calculator = new DistanceCalculator();
        calculator.report(coordinates);
        double distance = calculator.extractSquareRoot();

        System.out.println("두 점 사이 거리는 " + distance);
    }
}
