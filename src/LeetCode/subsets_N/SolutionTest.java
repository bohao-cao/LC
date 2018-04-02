package LeetCode.subsets_N;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void subsets() {
        Solution s= new Solution();
        List<List<Integer>> res = s.subsets(new int[]{1,2,3});
    }

}