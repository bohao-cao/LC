package LeetCode.lowestCommonAncestorOfABinaryTree;

import Common.TreeNode;
import apple.laf.JRSUIUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    /*
        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2       0       8
         /  \
         7   4
     */
    @Test
    void lowestCommonAncestor() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode n = s.lowestCommonAncestor(root, root.left, root.right);
        assertEquals(3,n.val);
    }

    @Test
    void lowestCommonAncestor2() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode n = s.lowestCommonAncestor(root, root.left,  root.left.right.right);
        assertEquals(3,n.val);
    }
}