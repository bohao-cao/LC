package LeetCode.wordLadder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void ladderLengthTest() {
        Solution s = new Solution();
        int ret = s.ladderLength("hit", "cog", Arrays.asList(new String[]{"hot","dot","dog","lot","log","cog"}));
        assertEquals(5,ret);
    }

    @Test
    void ladderLengthTest2() {
        Solution s = new Solution();
        int ret = s.ladderLength("a", "c", Arrays.asList(new String[]{"a","b","c"}));
        assertEquals(2,ret);
    }
}