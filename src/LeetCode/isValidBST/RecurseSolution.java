package LeetCode.isValidBST;
import Common.TreeNode;

public class RecurseSolution {
    public boolean isValidBST(TreeNode root) {
        return traverse(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean traverse(TreeNode n, int minVal, int maxVal){
        if(n==null)
            return true;
        if(n.val < minVal || n.val> maxVal)
            return false;
        return traverse(n.left, minVal, n.val) && traverse(n.right, n.val, maxVal);

    }
}
