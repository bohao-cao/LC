package LeetCode.reverseInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void reverse() {
        Solution s = new Solution();
        assertEquals(321, s.reverse(123));
    }

    @Test
    void reverse2() {
        Solution s = new Solution();
        assertEquals(21, s.reverse(120));
    }

    @Test
    void reverse3() {
        Solution s = new Solution();
        assertEquals(-5, s.reverse(-500));
    }

}