package lc206;

import LCListNode.ListNode;

public class Run {
    public static void main(String[] args) {
        Run r = new Run();
        r.reverseList(ListNode.buildNode(new int[]{1, 2, 3, 4, 5})).printList();
        r.reverseList(ListNode.buildNode(new int[]{2, 1})).printList();
        r.reverseList(ListNode.buildNode(new int[]{})).printList();
    }

    /**
     * <a href="https://leetcode.com/problems/reverse-linked-list/">...</a>
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode ln = new ListNode(head.val);
        head = head.next;
        while (head != null) {
            ListNode tmp = ln;
            ln = new ListNode(head.val);
            ln.next = tmp;

            head = head.next;
        }
        return ln;
    }
}
