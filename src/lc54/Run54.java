package lc54;

import java.util.ArrayList;
import java.util.List;

public class Run54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int state = 0;
        int[] states = new int[]{matrix[0].length, matrix.length, 0, 1};
        int[] pos = new int[]{0, 0};
        for (int i = 0; i < matrix.length * matrix[0].length; i++) {
            li.add(matrix[pos[0]][pos[1]]);
            switch (state) {
                case 0:
                    if (pos[1] < states[state] - 1) {
                        pos[1]++;
                    } else {
                        states[state]--;
                        state++;
                        pos[0]++;
                    }
                    break;
                case 1:
                    if (pos[0] < states[state] - 1) {
                        pos[0]++;
                    } else {
                        states[state]--;
                        state++;
                        pos[1]--;
                    }
                    break;
                case 2:
                    if (pos[1] > states[state]) {
                        pos[1]--;
                    } else {
                        states[state]++;
                        state++;
                        pos[0]--;
                    }
                    break;
                case 3:
                    if (pos[0] > states[state]) {
                        pos[0]--;
                    } else {
                        states[state]++;
                        state = 0;
                        pos[1]++;
                    }
                    break;
            }
        }

        return li;
    }
}
