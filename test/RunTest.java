import lc31.Run;
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
}
