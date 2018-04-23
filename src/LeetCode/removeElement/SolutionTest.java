package LeetCode.removeElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeElement() {
        int[] input = new int[]{0,1,2,2,3,0,4,2};

        Solution s = new Solution();
        int res = s.removeElement(input, 2);
        assertEquals(5, res);
    }
}