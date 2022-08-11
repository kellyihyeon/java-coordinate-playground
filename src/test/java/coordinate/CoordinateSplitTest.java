package coordinate;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateSplitTest {

    @Test
    void 좌표값이_하나일_때() {
        String input = "(10,10)";
        List<Integer> coordinates = CoordinateSplit.byComma(input);

        assertEquals(10, coordinates.get(0));
        assertEquals(10, coordinates.get(1));
    }
}
