package LintCode.strStr;

import LeetCode.strStr.Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test1() {
        LeetCode.strStr.Solution s = new LeetCode.strStr.Solution();
        int ret = s.strStr("abcdabcdefg", "bcd");
        assertEquals(1, ret);
    }

    @Test
    public void test2() {
        LeetCode.strStr.Solution s = new LeetCode.strStr.Solution();
        int ret = s.strStr("", "");
        assertEquals(0, ret);
    }

    @Test
    public void test3() {
        LeetCode.strStr.Solution s = new LeetCode.strStr.Solution();
        int ret = s.strStr("lintcode", "lintcode");
        assertEquals(0, ret);
    }

    @Test
    public void test4() {
        LeetCode.strStr.Solution s = new Solution();
        int ret = s.strStr("source", "rced");
        assertEquals(-1, ret);
    }

}