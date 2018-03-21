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

    @Test
    void ladderLengthTest3() {
        Solution s = new Solution();
        int ret = s.ladderLength("leet", "code", Arrays.asList(new String[]{"lest","leet","lose","code","lode","robe","lost"}));
        assertEquals(6,ret);
    }

    @Test
    void isMatchTest() {
        Solution s = new Solution();
        assertTrue(s.isMatch("leet","lest"));
    }

    @Test
    void isMatchTest2() {
        Solution s = new Solution();
        assertTrue(s.isMatch("lest","lose"));
    }
}