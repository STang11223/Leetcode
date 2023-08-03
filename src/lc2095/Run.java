package lc2095;

public class Run {
    public static void main(String[] args) {
        int[] vals = new int[]{1, 3, 4, 7, 1, 2, 6};
        ListNode ln = buildNode(vals);
        vals = new int[]{1, 2, 3, 4};
        ListNode ln2 = buildNode(vals);
        vals = new int[]{2, 1};
        ListNode ln3 = buildNode(vals);

        Run r = new Run();
        r.output(r.deleteMiddle(ln));
        r.output(r.deleteMiddle(ln2));
        r.output(r.deleteMiddle(ln3));
    }

    /**
     * Solution
     * https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
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

    public static ListNode buildNode(int[] array) {
        ListNode ln = new ListNode();
        ListNode rec = ln;
        for (int i = 0; i < array.length; i++) {
            rec.val = array[i];
            if (i <= array.length - 2) {
                rec.next = new ListNode();
                rec = rec.next;
            }
        }
        return ln;
    }

    public void output(ListNode n) {
        while (n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
        System.out.println();
    }
}

