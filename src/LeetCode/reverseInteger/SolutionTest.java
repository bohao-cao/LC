package LeetCode.reverseInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void reverse() {
        Solution s = new Solution();
        assertEquals(321, s.reverse(123));
    }

}