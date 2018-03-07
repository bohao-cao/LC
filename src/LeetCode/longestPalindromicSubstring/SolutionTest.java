package LeetCode.longestPalindromicSubstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class SolutionTest {
    @org.junit.jupiter.api.Test
    void test1() {
        Solution s = new Solution();
        String ret = s.longestPalindrome("babad");
        assertEquals("bab", ret);

    }

    @org.junit.jupiter.api.Test
    void test2() {
        Solution s = new Solution();
        String ret = s.longestPalindrome("cbbd");
        assertEquals("bb", ret);

    }

    @org.junit.jupiter.api.Test
    void test3() {
        Solution s = new Solution();
        String ret = s.longestPalindrome("bb");
        assertEquals("bb", ret);

    }
}