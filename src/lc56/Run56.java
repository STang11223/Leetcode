package lc56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Run56 {

    public int[][] merge(int[][] intervals) {
        List<int[]> li = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparing(o -> o[0]));
        li.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] in = li.get(li.size() - 1);
            int prev = in[1];
            int[] current = intervals[i];

            if (prev >= current[0] || prev >= current[1]) {
                int max = Math.max(prev, current[1]);
                in[1] = max;
            } else {
                li.add(current);
            }
        }
        return li.toArray(int[][]::new);
    }

    public int[][] merge_old(int[][] intervals) {
        List<List<Integer>> li = new ArrayList<>();
        for (int[] i : intervals) {
            li.add(Arrays.stream(i).boxed().collect(Collectors.toList()));
        }

        li.sort(Comparator.comparing(o -> o.get(0)));
        int ind = 1;
        while (ind < li.size()) {
            List<Integer> current = li.get(ind);
            List<Integer> prev = li.get(ind - 1);
            if (prev.get(1) >= current.get(0) || prev.get(1) > current.get(1)) {
                int max = Math.max(Math.max(current.get(0), current.get(1)), prev.get(1));
                prev.set(1, max);
                li.remove(ind);
                continue;
            }
            ind++;
        }
        return li.stream().map(l -> l.stream().mapToInt(k -> k).toArray()).toArray(int[][]::new);
    }
}
