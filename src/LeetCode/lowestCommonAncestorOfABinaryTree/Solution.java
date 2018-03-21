package LeetCode.lowestCommonAncestorOfABinaryTree;


import Common.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root, p,q);
    }

    public TreeNode lca(TreeNode node, TreeNode p, TreeNode q){
        if(node == null) return null;
        if(node == p || node == q) return node;
        TreeNode l = lca(node.left, p, q);
        TreeNode r = lca(node.right, p ,q);
        if(l!= null && r== null)
            return l;
        if(r!= null && l==null)
            return r;
        if(l!=null && r!=null)
            return node;
        return null;
    }
}
