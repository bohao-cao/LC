package LeetCode.combinationSumII;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void combinationSum2() {
        Solution s = new Solution();
        List<List<Integer>> res = s.combinationSum2(new int[]{10,1,2,7,6,1,5},8);
    }

}