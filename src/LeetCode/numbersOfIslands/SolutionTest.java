package LeetCode.numbersOfIslands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void numIslands() {
        char[][] grid = new char[][]
                {{'1','1','1','1','0'}, {'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        Solution d = new Solution();
        int ret = d.numIslands(grid);
        assertEquals(1,ret);
    }

}