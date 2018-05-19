package LeetCode.longestPalindromicSubstring;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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

    @org.junit.jupiter.api.Test
    void test4() {
        Solution2 s = new Solution2();
        Assertions.assertEquals("aba", s.longestPalindrome("babad"));
    }

    @org.junit.jupiter.api.Test
    void test5() {
        Solution2 s = new Solution2();
        Assertions.assertEquals("bb", s.longestPalindrome("cbbd"));
    }

    @org.junit.jupiter.api.Test
    void test6() {
        Solution2 s = new Solution2();
        Assertions.assertEquals("a", s.longestPalindrome("a"));
    }
}