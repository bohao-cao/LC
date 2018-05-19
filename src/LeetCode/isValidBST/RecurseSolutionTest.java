package LeetCode.isValidBST;

import Common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecurseSolutionTest {

    @Test
    void isValidBST() {
        RecurseSolution s = new RecurseSolution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        assertFalse(s.isValidBST(root));
    }
}