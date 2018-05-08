package Wayfair.Sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution s;
    private SolutionInPlace sip;
    @BeforeEach
    public void init(){
        s = new Solution();
        sip = new SolutionInPlace();
    }
    @Test
    public void sort() {
        int[] input = new int[]{3,-1,5,-2,6,0};
        int[] expected = new int[]{-1,-2,0,3,5,6};

        int[] res = s.sort(input);
        assertTrue(Arrays.equals(expected, res));

        res = sip.sort(input);
        assertTrue(Arrays.equals(expected, res));

        res = sip.sortOnePass(input);
        assertTrue(Arrays.equals(expected, res));
    }

    @Test
    public void sort2() {
        int[] input = new int[]{3,5,6,0,-1,-2};
        int[] expected = new int[]{-1,-2,0,3,5,6};

        int[] res = s.sort(input);
        assertTrue(Arrays.equals(expected, res));

        res = sip.sort(input);
        assertTrue(Arrays.equals(expected, res));

        res = sip.sortOnePass(input);
        assertTrue(Arrays.equals(expected, res));

    }

    @Test
    public void sort3() {
        int[] input = new int[]{3,5,6,-1,-2};
        int[] expected = new int[]{-1,-2,3,5,6};

        int[] res = s.sort(input);
        assertTrue(Arrays.equals(expected, res));

        res = sip.sort(input);
        assertTrue(Arrays.equals(expected, res));

        res = sip.sortOnePass(input);
        assertTrue(Arrays.equals(expected, res));

    }

    @Test
    public void sort4() {
        int[] input = new int[]{3,0,-5,6,0,-1,-2};
        int[] expected = new int[]{-5,-1,-2,0,0, 3,6};

        int[] res = s.sort(input);
        assertTrue(Arrays.equals(expected, res));

        res = sip.sort(input);
        assertTrue(Arrays.equals(expected, res));

        res = sip.sortOnePass(input);
        assertTrue(Arrays.equals(expected, res));

    }

}