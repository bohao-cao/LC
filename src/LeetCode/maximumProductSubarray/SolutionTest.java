package LeetCode.maximumProductSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProduct() {
        Solution s = new Solution();
        assertEquals(6,s.maxProduct(new int[]{2,3,-2,4}));
    }

    @Test
    void maxProduct2() {
        Solution s = new Solution();
        assertEquals(6,s.maxProduct(new int[]{1,0,3,2}));
    }

    @Test
    void maxProduct3() {
        Solution s = new Solution();
        assertEquals(1,s.maxProduct(new int[]{1,0,0}));
    }

    @Test
    void maxProduct4() {
        Solution s = new Solution();
        assertEquals(99,s.maxProduct(new int[]{1,0,-3,99}));
        assertEquals(99*6,s.maxProduct(new int[]{1,0,-3,-2,99}));
    }

    @Test
    void maxProduct5(){
        Solution s = new Solution();
        assertEquals(-2,s.maxProduct(new int[]{-2}));
    }

}