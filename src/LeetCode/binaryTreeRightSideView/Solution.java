package LeetCode.binaryTreeRightSideView;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Integer> result = new ArrayList();
    public List<Integer> rightSideView(TreeNode root) {
        if(root != null) {
            result.add(root.val);
            dfs(root.right, 2);
            dfs(root.left, 2);

        }

        return result;

    }

    private void dfs(TreeNode p, int level){
        if(p == null)
            return;
        if(p != null && result.size() < level)
           result.add(p.val);

        dfs(p.right, level+1);
        dfs(p.left, level+1);

        return;

    }
}
