package LeetCode.binaryTreeLevelOrderTraversalII;

import Common.TreeNode;

import java.util.*;

/*Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

        For example:
        Given binary tree [3,9,20,null,null,15,7],
         3
        / \
       9  20
       /   \
      15   7
        return its bottom-up level order traversal as:
        [
        [15,7],
        [9,20],
        [3]
        ]*/
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if(root == null)
            return ret;

        Queue<TreeNode> q = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();

        q.add(root);

        while(!q.isEmpty()){
            List<Integer> r = new ArrayList<>();
            int size = q.size();
            while(size-- >0){
                TreeNode n = q.poll();
                r.add(n.val);
                if(n.left != null)
                    q.add(n.left);
                if(n.right != null)
                    q.add(n.right);
            }
            stack.push(r);
        }

        while(!stack.empty())
            ret.add(stack.pop());

        return ret;


    }
}
