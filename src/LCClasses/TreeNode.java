package LCClasses;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * Build an integer binary tree that accepts nulls
     * Code from <a href="https://stackoverflow.com/a/56540526">...</a>
     *
     * @param array
     * @return
     */
    public static TreeNode createTree(Integer[] array) {
        if (array == null || array.length == 0) return null;

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        Queue<Integer> integerQueue = new LinkedList<>();
        for (int i = 1; i < array.length; i++) integerQueue.offer(array[i]);

        TreeNode treeNode = new TreeNode(array[0]);
        treeNodeQueue.offer(treeNode);

        while (!integerQueue.isEmpty()) {
            Integer leftVal = integerQueue.isEmpty() ? null : integerQueue.poll();
            Integer rightVal = integerQueue.isEmpty() ? null : integerQueue.poll();
            TreeNode current = treeNodeQueue.poll();
            if (leftVal != null) {
                TreeNode left = new TreeNode(leftVal);
                current.left = left;
                treeNodeQueue.offer(left);
            }
            if (rightVal != null) {
                TreeNode right = new TreeNode(rightVal);
                current.right = right;
                treeNodeQueue.offer(right);
            }
        }
        return treeNode;
    }
}
