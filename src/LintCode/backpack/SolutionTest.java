package LintCode.backpack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void backPack() {
        Solution s = new Solution();
        int r = s.backPack(10, new int[]{3,4,8,5});
        assertEquals(9,r);


    }

    @Test
    void backPack2() {
        Solution s = new Solution();
        int r = s.backPack(10, new int[]{2,5,4,3});
        assertEquals(10,r);


    }

}