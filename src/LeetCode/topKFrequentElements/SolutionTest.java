package LeetCode.topKFrequentElements;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void topKFrequent() {
        Solution s = new Solution();
        List<Integer> res = s.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
    }

    //TODO; this test case is failing now under the current code.
    @Test
    void topKFrequent4() {
        Solution s = new Solution();
        List<Integer> res = s.topKFrequent(new int[]{1,1,1,2,2,3}, 4);
    }

    @Test
    void topKFrequent2() {
        Solution s = new Solution();
        List<Integer> res = s.topKFrequent(new int[]{1}, 1);
    }


    @Test
    void topKFrequent3() {
        Solution s = new Solution();
        List<Integer> res = s.topKFrequent(new int[]{1,2}, 2);
    }

}