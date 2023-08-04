package lc2130;

import LCListNode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Run r = new Run();
        System.out.println(r.pairSum(ListNode.buildNode(new int[]{5, 4, 2, 1})));
        System.out.println(r.pairSum(ListNode.buildNode(new int[]{4, 2, 2, 3})));
        System.out.println(r.pairSum(ListNode.buildNode(new int[]{1, 10000})));
    }

    public int pairSum(ListNode head) {
        List<Integer> li = new ArrayList<>();
        while (head != null) {
            li.add(head.val);
            head = head.next;
        }
        int max = 0;
        for (int i = 0, j = li.size() - 1; i < li.size() / 2; i++, j--) {
            max = Math.max(max, (li.get(i) + li.get(j)));
        }

        return max;
    }
}
