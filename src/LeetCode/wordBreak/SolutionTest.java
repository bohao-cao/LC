package LeetCode.wordBreak;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void wordBreakTest() {
        String s = "leetcode";
        List<String> dict = Arrays.asList(new String[]{"leet","code"});

        Solution solution = new Solution();

        assertTrue(solution.wordBreak(s, dict));
    }

    @Test
    void wordBreakTestbfs() {
        String s = "leetcode";
        List<String> dict = Arrays.asList(new String[]{"leet","code"});

        Solution solution = new Solution();

        assertTrue(solution.bfsSolution(s, dict));
    }

    @Test
    void wordBreakTestbfs2() {
        String s = "aaaaaaa";
        List<String> dict = Arrays.asList(new String[]{"aaaa","aaa"});

        Solution solution = new Solution();
        assertTrue(solution.bfsSolution(s, dict));
    }

    @Test
    void wordBreakTest2() {
        String s = "aaaaaaa";
        List<String> dict = Arrays.asList(new String[]{"aaaa","aaa"});

        Solution solution = new Solution();
        assertTrue(solution.wordBreak(s, dict));
    }

    @Test
    void wordBreakTest3() {
        String s = "catsanddog";
        List<String> dict = Arrays.asList(new String[]{"cat","cats","and","sand","dog"});

        Solution solution = new Solution();
        assertTrue(solution.wordBreak(s, dict));
    }

    @Test
    void wordBreakTestbfs3() {
        String s = "catsanddog";
        List<String> dict = Arrays.asList(new String[]{"cat","cats","and","sand","dog"});

        Solution solution = new Solution();
        assertTrue(solution.wordBreak(s, dict));
    }

}