package LeetCode.binarySearchTreeIterator;

/**
 * Implement an iterator over a binary search tree (BST).
 * Your iterator will be initialized with the root node of a BST.
 *
 * Calling next() will return the next smallest number in the BST.
 *
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory,
 * where h is the height of the tree.
 */

import Common.TreeNode;

import java.util.Stack;

public class BSTIterator {

    private Stack<TreeNode> stack;
    //current state(which is next) is the top of the stack.

    public BSTIterator(TreeNode root) {
        stack = new Stack();
        if(root != null) {
            stack.push(root);
            //add smallest
            TreeNode p =root;
            while(p.left != null){
                p = p.left;
                stack.push(p);
            }
        }

    }

    //O(1)
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    //O(h)
    /** @return the next smallest number */
    public int next() {
        TreeNode res = stack.pop();
        TreeNode n = res;
        if(n.right != null){
            n = n.right;
            stack.push(n);
            while(n.left != null){
                n = n.left;
                stack.push(n);
            }
        }
        return res.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */