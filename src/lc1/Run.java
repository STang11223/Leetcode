package lc1;

import java.util.*;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) {
        Run r = new Run();
        System.out.println(Arrays.toString(r.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(r.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(r.twoSum(new int[]{3, 3}, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
//        int[] sums = new int[2];
//        List<Integer> li = Arrays.stream(nums).boxed().toList();
//        for (int i = nums.length - 1; i > 0; i--) {
//            int diff = target - nums[i];
//            if (li.contains(diff) && li.indexOf(diff) != i) {
//                sums[0] = i;
//                sums[1] = li.indexOf(diff);
//                break;
//            }
//        }
//        return sums;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
