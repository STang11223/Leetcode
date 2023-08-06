package lc21;

import LCClasses.ListNode;

public class Run {
    public static void main(String[] args) {
        new Run(ListNode.buildNode(new int[]{1, 2, 4}), ListNode.buildNode(new int[]{1, 3, 4}));
        new Run(ListNode.buildNode(new int[]{}), ListNode.buildNode(new int[]{}));
        new Run(ListNode.buildNode(new int[]{}), ListNode.buildNode(new int[]{0}));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ln = new ListNode();
        ListNode tmp = ln;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                ln = ln.next = new ListNode(list2.val);
                list2 = list2.next;
                continue;
            } else if (list2 == null) {
                ln = ln.next = new ListNode(list1.val);
                list1 = list1.next;
                continue;
            }

            if (list1.val <= list2.val) {
                ln = ln.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                ln = ln.next = new ListNode(list2.val);
                list2 = list2.next;
            }
        }

        return tmp.next;
    }

    Run(ListNode list1, ListNode list2) {
        System.out.println(mergeTwoLists(list1, list2));
    }
}
