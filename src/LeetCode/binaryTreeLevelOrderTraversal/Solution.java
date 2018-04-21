package LeetCode.binaryTreeLevelOrderTraversal;

import Common.TreeNode;

import java.util.*;

/*Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

        For example:
        Given binary tree [3,9,20,null,null,15,7],
         3
        / \
       9  20
      /    \
      15    7
       return its level order traversal as:
        [
        [3],
        [9,20],
        [15,7]
        ]
*/
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return null;

        List<List<Integer>> ret = new ArrayList<>();

        Queue<TreeNode> q = new ArrayDeque<>();

        q.add(root);

        int count =0;
        while(!q.isEmpty()){
            int size = q.size();
            ret.add(new ArrayList<>());
            while(size-- >0){
                TreeNode n = q.poll();
                ret.get(count).add(n.val);
                if(n.left != null)
                    q.add(n.left);
                if(n.right != null)
                    q.add(n.right);
            }
            count++;
        }

        return ret;
    }
}
