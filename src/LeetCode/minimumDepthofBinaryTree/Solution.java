package LeetCode.minimumDepthofBinaryTree;

import Common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path
from the root node down to the nearest leaf node.*/
public class Solution {
    public int minDepth(TreeNode root) {
        if(root== null)
            return 0;
        Queue<TreeNode> q = new LinkedList();
        int depth = 1;
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            while(size-- >0){
                TreeNode n = q.poll();
                if(n.left == null && n.right == null)
                    return depth;
                if(n.left != null)
                    q.add(n.left);
                if(n.right != null)
                    q.add(n.right);
            }
            depth++;
        }

        return 0;
    }
}
