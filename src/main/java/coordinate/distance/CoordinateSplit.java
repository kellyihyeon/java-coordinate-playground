package coordinate.distance;

import java.util.Arrays;
import java.util.List;

public class CoordinateSplit {

    public static List<Integer> byComma(String input) {
        final int FIRST = 0;
        final int SECOND = 1;
        String stringX = input.split(",")[FIRST].replace("(", "");
        String stringY = input.split(",")[SECOND].replace(")", "");

        return Arrays.asList(Integer.parseInt(stringX), Integer.parseInt(stringY));
    }

    public static Coordinates byDash(String input) {
        Coordinates coordinates = new Coordinates();
        for (String rawCoordinate : input.split("-")) {
            List<Integer> nums = byComma(rawCoordinate);
            coordinates.add(new Coordinate(nums.get(0), nums.get(1)));
        }
        return coordinates;
    }
}
