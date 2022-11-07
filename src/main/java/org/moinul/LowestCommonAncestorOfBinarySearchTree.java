package org.moinul;

import org.moinul.helpermodel.TreeNode;

public class LowestCommonAncestorOfBinarySearchTree implements MyRunner {
    @Override
    public void run() {
        TreeNode root = new TreeNode(5);
        TreeNode p = new TreeNode();
        TreeNode q = new TreeNode();
        TreeNode result = lowestCommonAncestor(root, p, q);
        System.out.println("LCA: " + result);
    }

    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        else if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        else
            return root;

    }
}
