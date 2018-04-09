package LeetCode.longestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestCommonPrefix() {
        String[] e = new String[]{"c","c"};
        Solution s = new Solution();
        s.longestCommonPrefix(e);
    }

    @Test
    void longestCommonPrefix1() {
        String[] e = new String[]{"aa","a"};
        Solution s = new Solution();
        s.longestCommonPrefix(e);
    }

}