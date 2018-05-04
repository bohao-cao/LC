package Sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sort() {
        Solution s = new Solution();
        int[]res = s.sort(new int[]{3,-1,5,-2,6,0});

        assertTrue(Arrays.equals(new int[]{-1,-2,0,3,5,6}, res));
    }

    @Test
    void sort2() {
        Solution s = new Solution();
        int[]res = s.sort(new int[]{3,5,6,0,-1,-2});

        assertTrue(Arrays.equals(new int[]{-1,-2,0,3,5,6}, res));
    }

    @Test
    void sort3() {
        Solution s = new Solution();
        int[]res = s.sort(new int[]{3,5,6,-1,-2});

        assertTrue(Arrays.equals(new int[]{-1,-2,3,5,6}, res));
    }

    @Test
    void sort4() {
        Solution s = new Solution();
        int[]res = s.sort(new int[]{3,0,-5,6,0,-1,-2});

        assertTrue(Arrays.equals(new int[]{-5,-1,-2,0,0, 3,6}, res));
    }

    @Test
    void sort_inplace() {
        SolutionInPlace s = new SolutionInPlace();
        int[]res = s.sort(new int[]{3,-1,5,-2,6,0});

        assertTrue(Arrays.equals(new int[]{-1,-2,0,3,5,6}, res));
    }

    @Test
    void sort3_inplace() {
        SolutionInPlace s = new SolutionInPlace();
        int[]res = s.sort(new int[]{3,5,6,-1,-2});

        assertTrue(Arrays.equals(new int[]{-1,-2,3,5,6}, res));
    }

    @Test
    void sort2_Inplace() {
        SolutionInPlace s = new SolutionInPlace();
        int[]res = s.sort(new int[]{3,5,6,0,-1,-2});

        assertTrue(Arrays.equals(new int[]{-1,-2,0,3,5,6}, res));
    }

    @Test
    void sort4_Inplace() {
        SolutionInPlace s = new SolutionInPlace();
        int[]res = s.sort(new int[]{3,0,-5,6,0,-1,-2});

        assertTrue(Arrays.equals(new int[]{-5,-1,-2,0,0, 3,6}, res));
    }
}