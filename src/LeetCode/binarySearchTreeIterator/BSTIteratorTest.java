package LeetCode.binarySearchTreeIterator;

import Common.TreeNode;
import org.junit.jupiter.api.Test;

class BSTIteratorTest {
   @Test
   void t1(){

       TreeNode n = new TreeNode(1);
       n.right= new TreeNode(3);
       BSTIterator obj = new BSTIterator(n);
       while(obj.hasNext())
           obj.next();
   }


}