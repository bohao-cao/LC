package Common;

import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeExTest {

    @Test
    void inOrderTraverse() {
        TreeNode n = new TreeNode(2);
        n.left= new TreeNode(1);
        n.right= new TreeNode(4);
        n.right.left = new TreeNode(3);
        n.right.right = new TreeNode(5);

        List<Integer> res = TreeNodeEx.inOrderTraverse(n);
        int[] ts = res.stream().mapToInt(Integer::intValue).toArray();
        assertTrue(Arrays.equals(ts, new int[]{1,2,3,4,5}));
    }

    @Test
    void preOrderTraverse() {
        //root, left ,right
        TreeNode n = new TreeNode(2);
        n.left= new TreeNode(1);
        n.right= new TreeNode(4);
        n.right.left = new TreeNode(3);
        n.right.right = new TreeNode(5);

        List<Integer> res = TreeNodeEx.preOrderTraverse(n);
        int[] ts = res.stream().mapToInt(Integer::intValue).toArray();
        assertTrue(Arrays.equals(ts, new int[]{2,1,4,3,5}));
    }
}