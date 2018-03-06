package LeetCode.longestPalindromicSubstring;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {
    @org.junit.jupiter.api.Test
    void test1() {
        Solution2 s = new Solution2();
        assertEquals("bab", s.longestPalindrome("babad"));
    }

    @org.junit.jupiter.api.Test
    void test2() {
        Solution2 s = new Solution2();
        assertEquals("bb", s.longestPalindrome("cbbd"));
    }

    @org.junit.jupiter.api.Test
    void test3() {
        Solution2 s = new Solution2();
        assertEquals("a", s.longestPalindrome("a"));
    }
}