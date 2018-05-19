package Common;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeEx {
    public static List<Integer> inOrderTraverse(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inOrderTraverse(root, res);
        return res;
    }
    private static void inOrderTraverse(TreeNode p, List<Integer> l){
        if(p == null)
            return;
        inOrderTraverse(p.left, l);
        l.add(p.val);
        inOrderTraverse(p.right, l);
    }

    public static List<Integer> preOrderTraverse(TreeNode root){
        List<Integer> res = new ArrayList<>();
        preOrderTraverse(root, res);
        return res;
    }
    private static void preOrderTraverse(TreeNode p, List<Integer> l){
        if(p == null)
            return;
        l.add(p.val);
        preOrderTraverse(p.left, l);
        preOrderTraverse(p.right, l);
    }
}
