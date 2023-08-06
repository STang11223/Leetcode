import lc31.Run;
import lc34.Run34;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RunTest {
    @Test
    void run31() {
        int[] q = new int[]{1, 2, 3};
        new Run(q);
        assertArrayEquals(q, new int[]{1, 3, 2});

        q = new int[]{3, 2, 1};
        new Run(q);
        assertArrayEquals(q, new int[]{1, 2, 3});

        q = new int[]{1, 1, 5};
        new Run(q);
        assertArrayEquals(q, new int[]{1, 5, 1});
    }

    @Test
    void run34() {
        Run34 r = new Run34();
        assertArrayEquals(r.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8), new int[]{3, 4});
        assertArrayEquals(r.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6), new int[]{-1, -1});
        assertArrayEquals(r.searchRange(new int[]{}, 0), new int[]{-1, -1});
    }
}
