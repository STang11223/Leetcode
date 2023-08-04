package LCClasses;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * @param array list of int values to generate a linked-list
     * @return ListNode
     */
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

    public void printList() {
        ListNode ln = this;
        while (ln != null) {
            System.out.print(ln.val + " ");
            ln = ln.next;
        }
        System.out.println();
    }
}
