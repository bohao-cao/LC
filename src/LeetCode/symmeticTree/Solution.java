package LeetCode.symmeticTree;


import Common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return search(root.left, root.right);

    }

    private boolean search(TreeNode l, TreeNode r) {
        if (l == null && r == null)
            return true;
        if ((l == null && r != null) || (l != null && r == null) || (l.val != r.val))
            return false;
        return search(l.left, r.right) && search(l.right, r.left);
    }
}
