package LeetCode.summaryRanges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void summaryRanges() {
        Solution s = new Solution();
        List<String> res = s.summaryRanges(new int[]{0,1,2,4,5,7});
    }
}