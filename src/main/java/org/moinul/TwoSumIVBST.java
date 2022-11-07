package org.moinul;

import org.moinul.helpermodel.TreeNode;

import java.util.HashMap;

public class TwoSumIVBST implements MyRunner {
    @Override
    public void run() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(7);

        int k = 9;
        boolean result = findTarget(root, k);
        System.out.println("Two Sum IV :" + result);
    }

    HashMap<Integer, Integer> hashMap = new HashMap<>();

    private boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (hashMap.containsKey(k - root.val)) return true;
        hashMap.put(root.val, 0);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
