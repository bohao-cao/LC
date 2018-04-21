package LeetCode.wordSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void exist() {

        char[][] input = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        Solution2 s = new Solution2();
        assertTrue(s.exist(input, "ABCCED"));
    }

    @Test
    void exist2() {

        char[][] input = new char[][]{{'A'}};
        Solution2 s = new Solution2();
        assertTrue(s.exist(input, "A"));
    }

    @Test
    void exist3() {

        char[][] input = new char[][]{{'a','b'},{'c','d'}};
        Solution2 s = new Solution2();
        assertTrue(s.exist(input, "abcd"));
    }

    @Test
    void exist3LC() {

        char[][] input = new char[][]{{'a','b'},{'c','d'}};
        LCSolution s = new LCSolution();
        assertTrue(s.exist(input, "abcd"));
    }
}