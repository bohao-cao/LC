package LeetCode.islandPerimeter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void t1(){
        Solution s = new Solution();
        int[][] input = new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        assertEquals(16, s.IslandPerimeter(input));
    }


}