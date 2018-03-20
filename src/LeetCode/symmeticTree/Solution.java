package LeetCode.symmeticTree;


import Common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return search(root.left, root.right);

    }

    private boolean search(TreeNode l, TreeNode r) {
        if (l == null && r == null)
            return true;
        if ((l == null && r != null) || (l != null && r == null))
            return false;
        if (l.val != r.val)
            return false;
        return search(l.left, r.right) && search(l.right, r.left);
    }
}
