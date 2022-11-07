package org.moinul;

import org.moinul.helpermodel.TreeNode;

public class ValidateBinarySearchTree implements MyRunner {
    @Override
    public void run() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        boolean result = isValidBST(root);
        System.out.println("Is Valid Binary Search Tree :" + result);
    }

    private boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode root, long min, long max) {
        if (root == null) return true;
        if ((root.val <= min) || (root.val >= max)) return false;
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }
}
