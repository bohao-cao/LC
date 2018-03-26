package LeetCode.threeSums;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void threeSum() {
        Solution s= new Solution();
        List<List<Integer>>res = s.threeSum(new int[]{-1,0,1,2,-1,-4});
    }

    @Test
    void threeSum2() {
        Solution s= new Solution();
        List<List<Integer>>res = s.threeSum(new int[]{-2,0,1,1,2});
    }


}