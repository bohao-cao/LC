package Wayfair.NoteCombine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void noteCombineTest() {
        Solution s = new Solution();
        int res = s.NoteCombine(110);
        assertEquals(4, res);

        res = s.NoteCombine(20);
        assertEquals(1, res);

        res = s.NoteCombine(40);
        assertEquals(2, res);

        res = s.NoteCombine(50);
        assertEquals(1, res);

        res = s.NoteCombine(100);
        assertEquals(1, res);

        res = s.NoteCombine(120);
        assertEquals(2, res);

        res = s.NoteCombine(140);
        assertEquals(3, res);

        res = s.NoteCombine(150);
        assertEquals(2, res);

        res = s.NoteCombine(160);
        assertEquals(4, res);

        res = s.NoteCombine(170);
        assertEquals(3, res);

        res = s.NoteCombine(180);
        assertEquals(5, res);

        res = s.NoteCombine(200);
        assertEquals(2, res);

        res = s.NoteCombine(300);
        assertEquals(3, res);

        res = s.NoteCombine(250);
        assertEquals(3, res);
    }

}