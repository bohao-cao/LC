package LeetCode.baseballGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void calPoints() {
        Solution s = new Solution();
        assertEquals(30,s.calPoints(new String[]{"5","2","C","D","+"}));
    }

}