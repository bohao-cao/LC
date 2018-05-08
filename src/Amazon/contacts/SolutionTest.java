package Amazon.contacts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void contacts() {
        Solution s = new Solution();
        String[][] input = new String[][]{{"add","hack"},{"add","hackerrank"},{"find","hac"},{"find","hak"}};
        assertEquals(2, s.contacts(input)[0]);
        assertEquals(0, s.contacts(input)[1]);
    }
}