package LeetCode.isValidBST;

import Common.TreeNode;

import java.util.Stack;

public class IterativeSolution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s = new Stack();
        if(root != null){
            s.push(root);
            TreeNode p = root;
            while(p.left!= null){
                p = p.left;
                s.push(p);
            }
        }

        long prev = Long.MIN_VALUE;
        while(!s.isEmpty()){
            TreeNode n = s.pop();
            if(prev >= n.val)
                return false;
            prev = n.val;

            if(n.right != null){
                n = n.right;
                s.push(n);
                while(n.left != null)
                {
                    n = n.left;
                    s.push(n);
                }
            }

        }

        return true;


    }
}
