package lc15;

import java.util.*;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) {
        new Run(new int[]{-1, 0, 1, 2, -1, -4});
        new Run(new int[]{0, 1, 1});
        new Run(new int[]{0, 0, 0});
        new Run(new int[]{-2, 0, 0, 2, 2});
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();

        int previous = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            // If the previous number is the same as the current number, skip
            if (previous == nums[i]) continue;

            previous = nums[i];
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    s.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return s.stream().toList();
    }

    Run(int[] s) {
        System.out.println(threeSum(s));
    }
}
