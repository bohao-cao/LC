package LeetCode.binarySearchTreeIterator;

import Common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

class BSTIteratorTest {
   @Test
   void t1(){

       TreeNode n = new TreeNode(1);
       n.right= new TreeNode(3);
       BSTIterator obj = new BSTIterator(n);
       while(obj.hasNext())
           obj.next();
   }

    @Test
    void t2(){

        TreeNode n = new TreeNode(2);
        n.left= new TreeNode(1);
        n.right= new TreeNode(4);
        n.right.left = new TreeNode(3);
        int[] res = new int[4];
        int i = 0;
        BSTIterator obj = new BSTIterator(n);
        while(obj.hasNext())
            res[i++]= obj.next();
        assertTrue(Arrays.equals(res, new int[]{1,2,3,4}));
    }


}