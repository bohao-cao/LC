package LeetCode.queueReconstructionByHeight;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reconstructQueue() {


        int[][] input = new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        Solution s = new Solution();
        int[][] output = s.reconstructQueue(input);
        //[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]

    }

}