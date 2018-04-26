package LeetCode.perfectSquares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numSquares() {
        Solution s = new Solution();
        assertEquals(3, s.numSquares(11));
    }
}