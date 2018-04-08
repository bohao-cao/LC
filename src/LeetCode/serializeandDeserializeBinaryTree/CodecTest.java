package LeetCode.serializeandDeserializeBinaryTree;

import Common.TreeNode;
import org.junit.jupiter.api.Test;

class CodecTest {
    @Test
    void serialize() {
        Codec c = new Codec();
        String input = "1,2,3,null,null,4,5,null,null,null,null";
        TreeNode n = c.deserialize(input);
        String output = c.serialize(n);
    }

}