package coordinate.distance;

public class CoordinateSplit {

    public static Coordinate byComma(String input) {
        final int FIRST = 0;
        final int SECOND = 1;
        String stringX = input.split(",")[FIRST].replace("(", "");
        String stringY = input.split(",")[SECOND].replace(")", "");

        return new Coordinate(Integer.parseInt(stringX), Integer.parseInt(stringY));
    }

    public static Coordinates byDash(String input) {
        Coordinates coordinates = new Coordinates();
        for (String rawCoordinate : input.split("-")) {
            coordinates.add(byComma(rawCoordinate));
        }
        return coordinates;
    }
}
