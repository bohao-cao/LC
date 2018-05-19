package LeetCode.jewelsAndStones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numJewelsInStones() {
        Solution s = new Solution();
        assertEquals(3,s.numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    void numJewelsInStones2() {
        Solution s = new Solution();
        assertEquals(0,s.numJewelsInStones("a", "AA"));
    }
}