package LeetCode.longestSubstringWithoutRepeatingCharacters.strStr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int ret = s.strStr("abcdabcdefg", "bcd");
        assertEquals(1, ret);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int ret = s.strStr("", "");
        assertEquals(0, ret);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int ret = s.strStr("lintcode", "lintcode");
        assertEquals(0, ret);
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        int ret = s.strStr("source", "rced");
        assertEquals(-1, ret);
    }
    @Test
    public void test5() {
        Solution s = new Solution();
        int ret = s.strStr("a", "");
        assertEquals(-1, ret);
    }

}