package lc104;

import LCClasses.TreeNode;

public class Run {
    public static void main(String[] args) {
        Run r = new Run();
        TreeNode tn;

        tn = TreeNode.createTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        System.out.println(r.maxDepth(tn));

        tn = TreeNode.createTree(new Integer[]{1, null, 2});
        System.out.println(r.maxDepth(tn));

        tn = TreeNode.createTree(new Integer[]{});
        System.out.println(r.maxDepth(tn));

    }

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : recurse(root, 0);
    }

    int recurse(TreeNode head, int sum) {
        int left = 0, right = 0;
        if (head.left != null) left = recurse(head.left, sum);
        if (head.right != null) right = recurse(head.right, sum);

        int result = Math.max(Math.max(left, right), sum);
        return ++result;
    }
}
