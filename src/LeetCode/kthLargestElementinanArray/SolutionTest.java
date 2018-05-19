package LeetCode.kthLargestElementinanArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findKthLargest() {
        Solution s = new Solution();
        int res = s.findKthLargest(new int[]{3,2,1,5,6,4}, 2);
        assertEquals(5, res);
    }

    @Test
    void findKthLargest2() {
        Solution s = new Solution();
        int res = s.findKthLargest(new int[]{  4,1
                , 3
                ,2
                ,16
                ,9
                ,10
                ,14
                ,8
                ,7}, 2);
        assertEquals(14, res);
    }


}