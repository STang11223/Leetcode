package lc2095;

import LCListNode.ListNode;

public class Run {
    public static void main(String[] args) {
        ListNode ln = ListNode.buildNode(new int[]{1, 3, 4, 7, 1, 2, 6});
        ListNode ln2 = ListNode.buildNode(new int[]{1, 2, 3, 4});
        ListNode ln3 = ListNode.buildNode(new int[]{2, 1});

        Run r = new Run();
        r.deleteMiddle(ln).printList();
        r.deleteMiddle(ln2).printList();
        r.deleteMiddle(ln3).printList();
    }

    /**
     * Solution
     * <a href="https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/">...</a>
     *
     * @param head
     * @return
     */
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;

        ListNode one = head;
        ListNode two = head;

        two = two.next.next;

        while (two != null && two.next != null) {
            two = two.next.next;
            one = one.next;
        }

        if (one.next != null) one.next = one.next.next;
        else head = null;

        return head;
    }
}

