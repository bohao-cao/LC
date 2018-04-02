package LeetCode.rotateImage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private void compareMatrix(int[][]exp, int[][]m){
        for( int i=0;i<m.length;i++) {
            for (int j = 0; j < m[i].length; j++) {
                assertEquals(exp[i][j], m[i][j]);
            }
        }
    }

    @Test
    void rotate() {
        int[][] m = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Solution s = new Solution();
        s.rotate(m);
        int [][] exp = new int[][]{ {7,4,1}, {8,5,2}, {9,6,3}};
        compareMatrix(exp, m);

    }

    @Test
    void rotate2() {
        int[][] m = new int[][]{{ 5, 1, 9,11}, { 2, 4, 8,10}, {13, 3, 6, 7}, {15,14,12,16}};
        Solution s = new Solution();
        s.rotate(m);
        int [][] exp = new int[][]{ {15,13, 2, 5},{14, 3, 4, 1}, {12, 6, 8, 9},{16, 7,10,11}};
        compareMatrix(exp, m);

    }
}