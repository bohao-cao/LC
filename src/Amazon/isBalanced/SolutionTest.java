package Amazon.isBalanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isBalanced() {
        Solution s = new Solution();
        assertEquals("YES", s.isBalanced("{[()]}"));
        assertEquals("NO",s.isBalanced( "){[(])}"));
        assertEquals("YES",s.isBalanced("{{[[(())]]}}"));
    }
}