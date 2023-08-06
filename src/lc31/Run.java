package lc31;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        new Run(new int[]{1, 2, 3}, new int[]{1, 3, 2});
        new Run(new int[]{3, 2, 1}, new int[]{1, 2, 3});
        new Run(new int[]{1, 1, 5}, new int[]{1, 5, 1});
    }

    public void nextPermutation(int[] nums) {
        int lock = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                lock = i;
                int j = nums.length - 1;
                while (nums[j] <= nums[i - 1]) {
                    j--;
                }

                swap(nums, i - 1, j);
                break;
            }
        }

        int left = lock, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }

    Run(int[] s, int[] test) {
        nextPermutation(s);
        System.out.println(Arrays.toString(s) + " " + Arrays.equals(s, test));
    }
}
