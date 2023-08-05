package lc4;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Run r = new Run();
        System.out.println(r.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println(r.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
        System.out.println(r.findMedianSortedArrays(new int[]{}, new int[]{10}));
        System.out.println(r.findMedianSortedArrays(new int[]{}, new int[]{2, 2}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] in = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i + j < nums1.length + nums2.length) {
            if (i == nums1.length) {
                in[k++] = nums2[j];
                j++;
                continue;
            } else if (j == nums2.length) {
                in[k++] = nums1[i];
                i++;
                continue;
            }
            if (nums1[i] <= nums2[j]) {
                in[k++] = nums1[i];
                i++;
            } else {
                in[k++] = nums2[j];
                j++;
            }
        }

        return in.length % 2 == 0 ? (double) (in[k / 2] + in[k / 2 - 1]) / 2 : in[k / 2];
    }
}
