package LeetCode.serializeandDeserializeBinaryTree_N;


import Common.TreeNode;

import java.util.*;

/*
https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/
Serialization is the process of converting a data structure or object into a sequence of bits
so that it can be stored in a file or memory buffer, or transmitted across a network connection
link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree.
There is no restriction on how your serialization/deserialization algorithm should work.
You just need to ensure that a binary tree can be serialized to a string
and this string can be deserialized to the original tree structure.

For example, you may serialize the following tree

    1
   / \
  2   3
     / \
    4   5
as "[1,2,3,null,null,4,5]", just the same as how LeetCode OJ serializes a binary tree.
You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.



Note: Do not use class member/global/static variables to store states.
Your serialize and deserialize algorithms should be stateless.
* */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null )
            return null;
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode n = q.poll();
            sb.append(n==null? "null": String.valueOf(n.val)).append(",");
            if(n != null) {
                q.add(n.left);
                q.add(n.right);
            }
        }

        return sb.substring(0, sb.length() -1);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.length() ==0)
            return null;
        List<String> l = Arrays.asList(data.split(","));
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
        q.add(root);
        for(int i=1;i< l.size();i++){
            TreeNode v = q.poll();
            if(!Objects.equals(l.get(i),"null")){
                v.left = new TreeNode(Integer.valueOf(l.get(i)));
                q.add(v.left);
            }
            else
                v.left = null;
            if(!Objects.equals(l.get(i+1) , "null")){
                v.right = new TreeNode(Integer.valueOf(l.get(i+1)));
                q.add(v.right);
            }
            else
                v.right = null;
            i++;


        }
        return root;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));