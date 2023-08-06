package lc34;

public class Run34 {
    public int[] searchRange(int[] nums, int target) {
        int[] pos = new int[]{-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (pos[0] == -1) {
                    pos[0] = i;
                }

                pos[1] = i;
                continue;
            }
            if (pos[1] != -1) break;
        }

        return pos;
    }
}
