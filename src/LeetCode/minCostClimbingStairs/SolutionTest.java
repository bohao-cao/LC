package LeetCode.minCostClimbingStairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void minCostClimbingStairs() {
        Solution s = new Solution();
        int ret = s.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        assertEquals(6,ret);
    }

    @Test
    void minCostClimbingStairs2() {
        Solution s = new Solution();
        int ret = s.minCostClimbingStairs(new int[]{0,0,0,1});
        assertEquals(0,ret);
    }
    @Test
    void minCostClimbingStairs3() {
        Solution s = new Solution();
        int ret = s.minCostClimbingStairs(new int[]{0,1,1,0});
        assertEquals(1,ret);
    }


}