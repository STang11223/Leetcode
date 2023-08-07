import lc71.Run71;
import lc31.Run;
import lc34.Run34;
import lc49.Run49;
import lc50.Run50;
import lc54.Run54;
import lc56.Run56;
import lc65.Run65;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    void run49() {
        Run49 r = new Run49();
        // Works because both lists are sorted alphabetically. If any list has a string out of order, it will fail.
        // In that case, both ret and compare should be recursively sorted and compared again
        List<List<String>> ret = r.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        List<List<String>> compare = List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"));
        assertTrue(ret.containsAll(compare));

        ret = r.groupAnagrams(new String[]{""});
        compare = List.of(List.of(""));
        assertTrue(ret.containsAll(compare));

        ret = r.groupAnagrams(new String[]{"a"});
        compare = List.of(List.of("a"));
        assertTrue(ret.containsAll(compare));
    }

    @Test
    void run50() {
        Run50 r = new Run50();
        assertEquals(1024.00000, r.myPow(2, 10));
        assertEquals(9.261, r.myPow(2.1, 3));
        assertEquals(0.25, r.myPow(2, -2));
        assertEquals(700.28148, r.myPow(8.88023, 3));
        assertEquals(0.00000, r.myPow(2.00000, -2147483648));
        assertEquals(0.00000, r.myPow(0.00001, 2147483647));
        assertEquals(2e-05, r.myPow(8.84372, -5));
    }

    @Test
    void run54() {
        Run54 r = new Run54();
        assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), r.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertEquals(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), r.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
        assertEquals(List.of(1, 2), r.spiralOrder(new int[][]{{1}, {2}}));
    }

    @Test
    void run56() {
        Run56 r = new Run56();
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}},
                r.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
        assertArrayEquals(new int[][]{{1, 5}},
                r.merge(new int[][]{{1, 4}, {4, 5}}));
        assertArrayEquals(new int[][]{{1, 18}},
                r.merge(new int[][]{{1, 16}, {2, 15}, {3, 14}, {4, 18}}));
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}},
                r.merge(new int[][]{{1, 3}, {8, 10}, {15, 18}, {2, 6}}));
        assertArrayEquals(new int[][]{{1, 16}},
                r.merge(new int[][]{{1, 16}, {2, 15}}));
        assertArrayEquals(new int[][]{{0, 4}},
                r.merge(new int[][]{{1, 4}, {0, 4}}));
    }

    @Test
    void run65() {
        Run65 r = new Run65();
        assertTrue(r.isNumber("0"));
        assertTrue(r.isNumber("53.5e93"));
        assertTrue(r.isNumber("-.9"));
        assertTrue(r.isNumber("+6e-1"));
        assertTrue(r.isNumber("-90E3"));
        assertTrue(r.isNumber("-123.456e789"));
        assertTrue(r.isNumber(".1"));
        assertTrue(r.isNumber("46.e3"));
        assertFalse(r.isNumber("abc"));
        assertFalse(r.isNumber("99e2.5"));
        assertFalse(r.isNumber("--6"));
        assertFalse(r.isNumber("-+3"));
        assertFalse(r.isNumber("4e+"));
        assertFalse(r.isNumber("+."));
        assertFalse(r.isNumber("+E3"));
        assertFalse(r.isNumber(".e1"));
        assertFalse(r.isNumber("92e1740e91"));
        assertFalse(r.isNumber("+.E3"));
    }

    @Test
    void run71() {
        Run71 r = new Run71();
        assertEquals("/home", r.simplifyPath("/home/"));
        assertEquals("/", r.simplifyPath("/../"));
        assertEquals("/home/test/gest/.../mest", r.simplifyPath("/home/test/rest/best/../../gest/.../mest"));
        assertEquals("/home/test/gest/mest", r.simplifyPath("/home/test/rest/best/../../gest/./mest"));
    }
}
