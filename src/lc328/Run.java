package lc328;

import LCClasses.ListNode;

public class Run {
    public static void main(String[] args) {
        Run r = new Run();
        r.oddEvenList(ListNode.buildNode(new int[]{1, 2, 3, 4, 5})).printList();
        r.oddEvenList(ListNode.buildNode(new int[]{2, 1, 3, 5, 6, 4, 7})).printList();
    }

    /**
     * Odd Even Linked List
     * <a href="https://leetcode.com/problems/odd-even-linked-list/">...</a>
     *
     * @param head
     * @return
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode odd = new ListNode(head.val), even = new ListNode(head.next.val);
        ListNode ln = odd, ln2 = even;
        head = head.next.next;

        while (head != null) {
            odd.next = new ListNode(head.val);
            odd = odd.next;

            if (head.next != null) {
                even.next = new ListNode(head.next.val);
                even = even.next;
                head = head.next.next;
            } else break;
        }
        odd.next = ln2;

        return ln;
    }
}
