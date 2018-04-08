package LeetCode.moveZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void moveZeroes() {
        Solution s= new Solution();
        s.moveZeroes(new int[]{0,1,0,3,12});
    }

    @Test
    void moveZeroes2() {
        Solution s= new Solution();
        s.moveZeroes(new int[]{1,0});
    }

    @Test
    void moveZeroes3() {
        Solution s= new Solution();
        s.moveZeroes(new int[]{0,1,0,3,12});
    }

    @Test
    void moveZeroes4() {
        Solution s= new Solution();
        s.moveZeroes(new int[]{1});
    }

}